package com.asisee.testtask.presentation.common

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.asisee.testtask.R
import com.asisee.testtask.presentation.theme.Black48
import com.asisee.testtask.presentation.theme.Error
import com.asisee.testtask.presentation.theme.Grey
import com.asisee.testtask.presentation.theme.SecondaryDark

@Composable
fun PhotoPickerField(
    errorText: String,
    isError: Boolean,
    onPick: () -> Unit
) {
    Column(Modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
                .border(
                    width = 1.dp,
                    color = if (isError) Error else Grey,
                    shape = RoundedCornerShape(4.dp)
                ),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Text(
                text = stringResource(R.string.upload_your_photo),
                style = MaterialTheme.typography.bodyMedium,
                color = if (isError) Error else Black48,
                modifier = Modifier.padding(start = 16.dp)
            )
            TextButton(
                modifier = Modifier.padding(end = 8.dp),
                onClick = onPick,
                shape = RoundedCornerShape(24.dp)
            ) {
                Text(
                    text = stringResource(R.string.upload),
                    style = MaterialTheme.typography.bodyMedium,
                    color = SecondaryDark,
                    fontWeight = FontWeight.SemiBold
                )
            }
        }
        if (isError) {
            Text(
                text = errorText,
                style = MaterialTheme.typography.bodySmall,
                color = Error,
                modifier = Modifier.padding(start = 16.dp, top = 4.dp)
            )
        } else {
            Spacer(Modifier.height(20.dp))
        }
    }

}