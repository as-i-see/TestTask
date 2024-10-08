package com.asisee.testtask.presentation.res

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val Group: ImageVector
    get() {
        if (_Group != null) {
            return _Group!!
        }
        _Group = ImageVector.Builder(
            name = "Group",
            defaultWidth = 202.dp,
            defaultHeight = 200.dp,
            viewportWidth = 202f,
            viewportHeight = 200f
        ).apply {
            path(fill = SolidColor(Color(0xFFEBEBEB))) {
                moveTo(100.5f, 100f)
                moveToRelative(-100f, 0f)
                arcToRelative(100f, 100f, 0f, isMoreThanHalf = true, isPositiveArc = true, 200f, 0f)
                arcToRelative(100f, 100f, 0f, isMoreThanHalf = true, isPositiveArc = true, -200f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.87f,
                strokeLineWidth = 1f
            ) {
                moveTo(100.5f, 100f)
                moveToRelative(-99.5f, 0f)
                arcToRelative(99.5f, 99.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 199f, 0f)
                arcToRelative(99.5f, 99.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -199f, 0f)
            }
            path(fill = SolidColor(Color(0xFF9AF4FF))) {
                moveTo(44.5f, 106.38f)
                curveTo(56.18f, 106.38f, 66.5f, 109.17f, 74.89f, 112.82f)
                curveTo(82.63f, 116.26f, 87.5f, 124f, 87.5f, 132.39f)
                verticalLineTo(142f)
                curveTo(87.5f, 143.1f, 86.6f, 144f, 85.5f, 144f)
                horizontalLineTo(3.5f)
                curveTo(2.4f, 144f, 1.5f, 143.1f, 1.5f, 142f)
                verticalLineTo(132.46f)
                curveTo(1.5f, 124f, 6.37f, 116.26f, 14.11f, 112.9f)
                curveTo(22.5f, 109.17f, 32.82f, 106.38f, 44.5f, 106.38f)
                close()
                moveTo(44.5f, 58f)
                curveTo(56.4f, 58f, 66f, 67.6f, 66f, 79.5f)
                curveTo(66f, 91.4f, 56.4f, 101f, 44.5f, 101f)
                curveTo(32.6f, 101f, 23f, 91.4f, 23f, 79.5f)
                curveTo(23f, 67.6f, 32.6f, 58f, 44.5f, 58f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.87f,
                strokeLineWidth = 1f
            ) {
                moveTo(14.31f, 113.36f)
                lineTo(14.32f, 113.35f)
                curveTo(22.65f, 109.65f, 32.9f, 106.88f, 44.5f, 106.88f)
                curveTo(56.1f, 106.88f, 66.35f, 109.65f, 74.68f, 113.28f)
                curveTo(82.24f, 116.64f, 87f, 124.2f, 87f, 132.39f)
                verticalLineTo(142f)
                curveTo(87f, 142.83f, 86.33f, 143.5f, 85.5f, 143.5f)
                horizontalLineTo(3.5f)
                curveTo(2.67f, 143.5f, 2f, 142.83f, 2f, 142f)
                verticalLineTo(132.46f)
                curveTo(2f, 124.2f, 6.76f, 116.64f, 14.31f, 113.36f)
                close()
                moveTo(44.5f, 58.5f)
                curveTo(56.12f, 58.5f, 65.5f, 67.88f, 65.5f, 79.5f)
                curveTo(65.5f, 91.12f, 56.12f, 100.5f, 44.5f, 100.5f)
                curveTo(32.88f, 100.5f, 23.5f, 91.12f, 23.5f, 79.5f)
                curveTo(23.5f, 67.88f, 32.88f, 58.5f, 44.5f, 58.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF9AF4FF))) {
                moveTo(158.5f, 106.38f)
                curveTo(170.18f, 106.38f, 180.5f, 109.17f, 188.89f, 112.82f)
                curveTo(196.63f, 116.26f, 201.5f, 124f, 201.5f, 132.39f)
                verticalLineTo(142f)
                curveTo(201.5f, 143.1f, 200.6f, 144f, 199.5f, 144f)
                horizontalLineTo(117.5f)
                curveTo(116.39f, 144f, 115.5f, 143.1f, 115.5f, 142f)
                verticalLineTo(132.46f)
                curveTo(115.5f, 124f, 120.37f, 116.26f, 128.11f, 112.9f)
                curveTo(136.5f, 109.17f, 146.82f, 106.38f, 158.5f, 106.38f)
                close()
                moveTo(158.5f, 58f)
                curveTo(170.4f, 58f, 180f, 67.6f, 180f, 79.5f)
                curveTo(180f, 91.4f, 170.4f, 101f, 158.5f, 101f)
                curveTo(146.6f, 101f, 137f, 91.4f, 137f, 79.5f)
                curveTo(137f, 67.6f, 146.6f, 58f, 158.5f, 58f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.87f,
                strokeLineWidth = 1f
            ) {
                moveTo(128.31f, 113.36f)
                lineTo(128.32f, 113.35f)
                curveTo(136.65f, 109.65f, 146.9f, 106.88f, 158.5f, 106.88f)
                curveTo(170.1f, 106.88f, 180.35f, 109.65f, 188.68f, 113.28f)
                curveTo(196.24f, 116.64f, 201f, 124.2f, 201f, 132.39f)
                verticalLineTo(142f)
                curveTo(201f, 142.83f, 200.33f, 143.5f, 199.5f, 143.5f)
                horizontalLineTo(117.5f)
                curveTo(116.67f, 143.5f, 116f, 142.83f, 116f, 142f)
                verticalLineTo(132.46f)
                curveTo(116f, 124.2f, 120.76f, 116.64f, 128.31f, 113.36f)
                close()
                moveTo(158.5f, 58.5f)
                curveTo(170.12f, 58.5f, 179.5f, 67.88f, 179.5f, 79.5f)
                curveTo(179.5f, 91.12f, 170.12f, 100.5f, 158.5f, 100.5f)
                curveTo(146.88f, 100.5f, 137.5f, 91.12f, 137.5f, 79.5f)
                curveTo(137.5f, 67.88f, 146.88f, 58.5f, 158.5f, 58.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF9AF4FF))) {
                moveTo(101.5f, 100.25f)
                curveTo(115.08f, 100.25f, 127.08f, 103.5f, 136.83f, 107.75f)
                curveTo(145.83f, 111.75f, 151.5f, 120.75f, 151.5f, 130.5f)
                verticalLineTo(142f)
                curveTo(151.5f, 143.1f, 150.6f, 144f, 149.5f, 144f)
                horizontalLineTo(53.5f)
                curveTo(52.4f, 144f, 51.5f, 143.1f, 51.5f, 142f)
                verticalLineTo(130.58f)
                curveTo(51.5f, 120.75f, 57.17f, 111.75f, 66.17f, 107.83f)
                curveTo(75.92f, 103.5f, 87.92f, 100.25f, 101.5f, 100.25f)
                close()
                moveTo(101.5f, 44f)
                curveTo(115.33f, 44f, 126.5f, 55.17f, 126.5f, 69f)
                curveTo(126.5f, 82.83f, 115.33f, 94f, 101.5f, 94f)
                curveTo(87.67f, 94f, 76.5f, 82.83f, 76.5f, 69f)
                curveTo(76.5f, 55.17f, 87.67f, 44f, 101.5f, 44f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.87f,
                strokeLineWidth = 1f
            ) {
                moveTo(66.37f, 108.29f)
                lineTo(66.37f, 108.29f)
                curveTo(76.07f, 103.98f, 88f, 100.75f, 101.5f, 100.75f)
                curveTo(115f, 100.75f, 126.93f, 103.98f, 136.63f, 108.21f)
                curveTo(145.45f, 112.13f, 151f, 120.94f, 151f, 130.5f)
                verticalLineTo(142f)
                curveTo(151f, 142.83f, 150.33f, 143.5f, 149.5f, 143.5f)
                horizontalLineTo(53.5f)
                curveTo(52.67f, 143.5f, 52f, 142.83f, 52f, 142f)
                verticalLineTo(130.58f)
                curveTo(52f, 120.94f, 57.56f, 112.13f, 66.37f, 108.29f)
                close()
                moveTo(101.5f, 44.5f)
                curveTo(115.06f, 44.5f, 126f, 55.44f, 126f, 69f)
                curveTo(126f, 82.56f, 115.06f, 93.5f, 101.5f, 93.5f)
                curveTo(87.94f, 93.5f, 77f, 82.56f, 77f, 69f)
                curveTo(77f, 55.44f, 87.94f, 44.5f, 101.5f, 44.5f)
                close()
            }
        }.build()

        return _Group!!
    }

@Suppress("ObjectPropertyName")
private var _Group: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun GroupPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = Group, contentDescription = null)
    }
}

