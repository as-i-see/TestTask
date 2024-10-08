package com.asisee.testtask.presentation.ui.signupresult

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.asisee.testtask.R
import com.asisee.testtask.presentation.common.PrimaryButton
import com.asisee.testtask.presentation.res.Close
import com.asisee.testtask.presentation.res.SignUpFailed
import com.asisee.testtask.presentation.res.SignUpSuccess
import com.asisee.testtask.presentation.theme.Black87

@Composable
fun SignUpResultScreen(status: Int, close: () -> Unit) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.TopEnd,
    ) {
        IconButton(
            onClick = close,
            modifier = Modifier.padding(top = 24.dp, end = 24.dp)
        ) {
            Icon(
                imageVector = Close,
                contentDescription = stringResource(R.string.cancel),
            )
        }
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(
                imageVector = if (status == 0) SignUpSuccess else SignUpFailed,
                contentDescription = stringResource(
                    if (status == 0) R.string.success else R.string.fail
                )
            )
            Spacer(Modifier.height(24.dp))
            Text(
                text = stringResource(
                    when (status) {
                        0 -> R.string.user_successfully_registered
                        1 -> R.string.that_email_is_already_registered
                        else -> R.string.registration_is_unavailable
                    }
                ),
                style = MaterialTheme.typography.headlineLarge,
                color = Black87,
            )
            Spacer(Modifier.height(24.dp))
            PrimaryButton(
                title = stringResource(
                    if (status == 0)
                        R.string.got_it
                    else R.string.try_again
                ),
                onClick = close,
            )
        }
    }

}