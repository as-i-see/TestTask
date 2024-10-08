package com.asisee.testtask.presentation.common

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.asisee.testtask.R
import com.asisee.testtask.data.User
import com.asisee.testtask.presentation.res.PhotoCover
import com.asisee.testtask.presentation.theme.Black60
import com.asisee.testtask.presentation.theme.Black87

@Composable
fun UserCard(user: User, modifier: Modifier = Modifier) {
    val photoCoverPainter = rememberVectorPainter(PhotoCover)
    Row(modifier.padding(start = 16.dp, top = 24.dp, end = 16.dp, bottom = 24.dp).fillMaxWidth()) {
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(user.photo)
                .crossfade(true)
                .build(),
            placeholder = photoCoverPainter,
            contentDescription = "${user.name} ${stringResource(R.string.photo)}",
            contentScale = ContentScale.Fit,
            modifier = Modifier.size(50.dp).clip(CircleShape)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(
                text = user.name,
                style = MaterialTheme.typography.bodyLarge,
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = user.position,
                style = MaterialTheme.typography.bodySmall,
                color = Black60
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = user.email,
                style = MaterialTheme.typography.bodySmall,
                color = Black87,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
            Text(
                text = user.phone.formatPhoneNumber(),
                style = MaterialTheme.typography.bodySmall,
                color = Black87,
            )
        }
    }
}

fun String.formatPhoneNumber() = when (length) {
    13 -> run {
        "${this[0]}${this[1]}${this[2]} (${this[3]}${this[4]}${this[5]}) ${this[6]}${this[7]}${this[8]} ${this[9]}${this[10]} ${this[11]}${this[12]}"
    }
    12 -> run {
        "+${this[0]}${this[1]} (${this[2]}${this[3]}${this[4]}) ${this[5]}${this[6]}${this[7]} ${this[8]}${this[9]} ${this[10]}${this[11]}"
    }
    else -> this
}