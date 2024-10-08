package com.asisee.testtask.presentation.common

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.asisee.testtask.R
import com.asisee.testtask.presentation.theme.Black87
import com.asisee.testtask.presentation.theme.WhiteSmoke
import com.image.cropview.CropType
import com.image.cropview.EdgeType
import com.image.cropview.ImageCrop

data class ImageCropData (
    val imageCrop: ImageCrop,
    val aspectRatio: Float,
)

@Composable
fun ImageCropView(imageCropData: ImageCropData, onCrop: () -> Unit, onCancel: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        imageCropData.imageCrop.ImageCropView(
            modifier = Modifier.let {
                if (imageCropData.aspectRatio > 1) it.fillMaxWidth() else it.fillMaxHeight(0.66f)
            }.aspectRatio(imageCropData.aspectRatio),
            guideLineColor = WhiteSmoke,
            guideLineWidth = 2.dp,
            edgeCircleSize = 5.dp,
            showGuideLines = true,
            cropType = CropType.PROFILE_CIRCLE,
            edgeType = EdgeType.CIRCULAR,
        )
        Spacer(Modifier.height(8.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(
                onClick = onCancel,
                modifier = Modifier.width(140.dp)
            ) {
                Text(
                    text = stringResource(R.string.cancel),
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.SemiBold,
                    color = Black87
                )
            }
            Button(
                onClick = onCrop,
                modifier = Modifier.width(140.dp)
            ) {
                Text(
                    text = stringResource(R.string.crop),
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.SemiBold,
                    color = Black87
                )
            }
        }

    }
}
