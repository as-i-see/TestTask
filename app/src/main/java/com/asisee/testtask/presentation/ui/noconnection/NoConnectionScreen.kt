package com.asisee.testtask.presentation.ui.noconnection

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.asisee.testtask.R
import com.asisee.testtask.presentation.common.PrimaryButton
import com.asisee.testtask.presentation.res.NoConnection
import com.asisee.testtask.presentation.theme.Black87
import org.koin.androidx.compose.koinViewModel

@Composable
fun NoConnectionScreen(pop: () -> Unit) {
    val viewModel = koinViewModel<NoConnectionViewModel>()
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            imageVector = NoConnection,
            contentDescription = stringResource(R.string.logo)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = stringResource(R.string.there_is_no_internet_connection),
            style = MaterialTheme.typography.headlineLarge,
            color = Black87
        )
        Spacer(modifier = Modifier.height(16.dp))
        PrimaryButton(stringResource(R.string.try_again)) {
            viewModel.tryAgain {
                pop()
            }
        }
    }
}