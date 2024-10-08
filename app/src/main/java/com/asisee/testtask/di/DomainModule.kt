package com.asisee.testtask.di

import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import com.asisee.testtask.data.PAGE_SIZE
import com.asisee.testtask.data.local.LocalDatabase
import com.asisee.testtask.data.remote.users.UsersApi
import com.asisee.testtask.domain.repository.users.UserRemoteMediator
import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.Module
import org.koin.core.annotation.Single

@Module
@ComponentScan("com.asisee.testtask.domain")
class DomainModule {
    @OptIn(ExperimentalPagingApi::class)
    @Single
    fun userPager(localDatabase: LocalDatabase, usersApi: UsersApi) = Pager(
        config = PagingConfig(pageSize = PAGE_SIZE),
        remoteMediator = UserRemoteMediator(localDatabase, usersApi),
        pagingSourceFactory = {
            localDatabase.userDao.pagingSource()
        }
    )
}