package com.asisee.testtask.presentation.ui.users

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.pulltorefresh.PullToRefreshBox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.paging.LoadState
import androidx.paging.compose.collectAsLazyPagingItems
import androidx.paging.compose.itemKey
import com.asisee.testtask.R
import com.asisee.testtask.presentation.common.UserCard
import com.asisee.testtask.presentation.common.ErrorMessage
import com.asisee.testtask.presentation.common.LoadingNextPageItem
import com.asisee.testtask.presentation.common.TopBar
import com.asisee.testtask.presentation.res.Group
import com.asisee.testtask.presentation.theme.Black87
import com.asisee.testtask.presentation.theme.Grey
import org.koin.androidx.compose.koinViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UsersScreen() {
    val viewModel = koinViewModel<UsersViewModel>()
    val userPagingItems = viewModel.users.collectAsLazyPagingItems()
    val showRefresh by viewModel.refreshing.collectAsStateWithLifecycle()
    Column(Modifier.fillMaxSize()) {
        TopBar(stringResource(R.string.users_top_bar))
        if (userPagingItems.itemCount == 0) {
            Column(
                modifier = Modifier.fillMaxSize().background(Color.White),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ){
                Image(
                    imageVector = Group,
                    contentDescription = stringResource(R.string.group)
                )
                Spacer(Modifier.height(24.dp))
                Text(
                    text = stringResource(R.string.there_are_no_users_yet),
                    style = MaterialTheme.typography.headlineLarge,
                    color = Black87,
                )
            }
        } else {
            PullToRefreshBox(
                isRefreshing = showRefresh,
                onRefresh = {
                    viewModel.startRefresh()
                    userPagingItems.refresh()
                },
            ) {
                LazyColumn {
                    items(
                        count = userPagingItems.itemCount,
                        key = userPagingItems.itemKey { it.id }
                    ) { index ->
                        userPagingItems[index]?.let {
                            UserCard(it, modifier = Modifier.background(Color.White))
                        }
                        if (index < userPagingItems.itemCount - 1) HorizontalDivider(
                            Modifier.padding(start = 82.dp, end = 16.dp),
                            thickness = 1.dp,
                            color = Grey
                        )
                    }
                    userPagingItems.apply {
                        when {
                            loadState.refresh is LoadState.Loading -> {
                                item { LoadingNextPageItem(modifier = Modifier.fillParentMaxWidth()) }
                            }

                            loadState.refresh is LoadState.Error -> {
                                val error = loadState.refresh as LoadState.Error
                                item {
                                    ErrorMessage(
                                        modifier = Modifier.fillParentMaxWidth(),
                                        message = error.error.localizedMessage!!,
                                        onClickRetry = { retry() })
                                }
                            }
                            loadState.append is LoadState.Loading -> {
                                item { LoadingNextPageItem(modifier = Modifier.fillParentMaxWidth()) }
                            }
                            loadState.append is LoadState.Error -> {
                                val error = loadState.append as LoadState.Error
                                item {
                                    ErrorMessage(
                                        modifier = Modifier.fillParentMaxWidth(),
                                        message = error.error.localizedMessage!!,
                                        onClickRetry = { retry() })
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}