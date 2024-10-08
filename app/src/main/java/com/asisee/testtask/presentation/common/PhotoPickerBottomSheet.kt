package com.asisee.testtask.presentation.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.asisee.testtask.R
import com.asisee.testtask.presentation.res.Gallery
import com.asisee.testtask.presentation.theme.Black48
import com.asisee.testtask.presentation.theme.Black87
import com.asisee.testtask.presentation.theme.roboto

@Composable
fun PhotoPickerBottomSheet(
    modifier: Modifier = Modifier,
    hideBottomSheet: () -> Unit,
    cameraAction: () -> Unit,
    galleryAction: () -> Unit,

) {
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = stringResource(R.string.bottom_sheet_prompt),
            style = MaterialTheme.typography.bodyMedium,
            color = Black48,
            fontFamily = roboto,
        )
        Spacer(Modifier.height(32.dp))
        Row(
            modifier = Modifier.fillMaxWidth().padding(start = 16.dp, end = 16.dp),
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.weight(1f, true).clickable {
                    cameraAction()
                    hideBottomSheet()
                }
            ) {
                Image(
                    painter = painterResource(R.drawable.camera),
                    contentDescription = null,
                    modifier = Modifier.size(56.dp)
                )
                Spacer(Modifier.height(12.dp))
                Text(
                    text = stringResource(R.string.camera),
                    style = MaterialTheme.typography.bodyMedium,
                    color = Black87,
                    fontFamily = roboto,
                )
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.weight(1f, true).clickable {
                    galleryAction()
                    hideBottomSheet()
                }
            ) {
                Image(
                    imageVector = Gallery,
                    contentDescription = null,
                )
                Spacer(Modifier.height(12.dp))
                Text(
                    text = stringResource(R.string.gallery),
                    style = MaterialTheme.typography.bodyMedium,
                    color = Black87,
                    fontFamily = roboto,
                )
            }
        }
        Spacer(Modifier.height(44.dp))
    }
}