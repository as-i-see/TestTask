package com.asisee.testtask.domain.repository.users

import androidx.paging.ExperimentalPagingApi
import androidx.paging.LoadType
import androidx.paging.PagingState
import androidx.paging.RemoteMediator
import androidx.room.withTransaction
import com.asisee.testtask.data.PAGE_SIZE
import com.asisee.testtask.data.Page
import com.asisee.testtask.data.User
import com.asisee.testtask.data.local.LocalDatabase
import com.asisee.testtask.data.remote.users.UsersApi
import java.util.concurrent.TimeUnit


@OptIn(ExperimentalPagingApi::class)
class UserRemoteMediator (
    private val localDatabase: LocalDatabase,
    private val usersApi: UsersApi,
) : RemoteMediator<Int, User>() {

    override suspend fun initialize(): InitializeAction {
        val cacheTimeout = TimeUnit.MILLISECONDS.convert(1, TimeUnit.HOURS)
        val localPage = localDatabase.pageDao.getById(PAGE_KEY_ID)
        return if (localPage == null || System.currentTimeMillis() - localPage.lastRefreshTimestamp > cacheTimeout)
            InitializeAction.LAUNCH_INITIAL_REFRESH
        else InitializeAction.SKIP_INITIAL_REFRESH
    }

    override suspend fun load(
        loadType: LoadType,
        state: PagingState<Int, User>,
    ): MediatorResult {
        return try {
            val page = when (loadType) {
                LoadType.REFRESH -> 1
                LoadType.PREPEND -> null
                LoadType.APPEND -> {
                    localDatabase.pageDao.getById(PAGE_KEY_ID)?.let { localPage ->
                        if (localPage.page < localPage.total_pages)
                            localPage.page + 1
                        else null
                    }
                }
            } ?: return MediatorResult.Success(endOfPaginationReached = true)

            val apiResponse = usersApi.getUsers(
                page = page,
                count = PAGE_SIZE,
            )

            val results = apiResponse.users
            localDatabase.withTransaction {
                if (loadType == LoadType.REFRESH) {
                    localDatabase.userDao.clearAll()
                    localDatabase.pageDao.deleteById(PAGE_KEY_ID)
                }
                localDatabase.userDao.insertAll(
                    results
                )
                localDatabase.pageDao.insert(
                    Page(
                        id = PAGE_KEY_ID,
                        page = page,
                        total_pages = apiResponse.total_pages,
                        lastRefreshTimestamp = System.currentTimeMillis(),
                    )
                )
            }
            MediatorResult.Success(endOfPaginationReached = page == apiResponse.total_pages)
        } catch (e: Exception) {
            MediatorResult.Error(e)
        }
    }
}