package com.asisee.testtask.presentation.res

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val SignUpSuccess: ImageVector
    get() {
        if (_SuccessImage != null) {
            return _SuccessImage!!
        }
        _SuccessImage = ImageVector.Builder(
            name = "SignUpSuccess",
            defaultWidth = 200.dp,
            defaultHeight = 200.dp,
            viewportWidth = 200f,
            viewportHeight = 200f
        ).apply {
            path(fill = SolidColor(Color(0xFF00BDD3))) {
                moveTo(100f, 100f)
                moveToRelative(-100f, 0f)
                arcToRelative(100f, 100f, 0f, isMoreThanHalf = true, isPositiveArc = true, 200f, 0f)
                arcToRelative(100f, 100f, 0f, isMoreThanHalf = true, isPositiveArc = true, -200f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.87f,
                strokeLineWidth = 1f
            ) {
                moveTo(100f, 100f)
                moveToRelative(-99.5f, 0f)
                arcToRelative(99.5f, 99.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 199f, 0f)
                arcToRelative(99.5f, 99.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -199f, 0f)
            }
            path(
                fill = SolidColor(Color(0xFF9AF4FF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(133.33f, 33.42f)
                curveTo(133.33f, 32.38f, 134.46f, 31.73f, 135.36f, 32.25f)
                lineTo(162.84f, 48.15f)
                curveTo(163.74f, 48.67f, 163.74f, 49.97f, 162.84f, 50.49f)
                lineTo(135.36f, 66.39f)
                curveTo(134.46f, 66.92f, 133.33f, 66.27f, 133.33f, 65.22f)
                verticalLineTo(55.64f)
                horizontalLineTo(98.65f)
                verticalLineTo(43f)
                horizontalLineTo(133.33f)
                verticalLineTo(33.42f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.87f,
                strokeLineWidth = 1f
            ) {
                moveTo(133.83f, 55.64f)
                verticalLineTo(55.14f)
                horizontalLineTo(133.33f)
                horizontalLineTo(99.15f)
                verticalLineTo(43.5f)
                horizontalLineTo(133.33f)
                horizontalLineTo(133.83f)
                verticalLineTo(43f)
                verticalLineTo(33.42f)
                curveTo(133.83f, 32.77f, 134.54f, 32.36f, 135.11f, 32.69f)
                lineTo(162.59f, 48.59f)
                curveTo(163.16f, 48.92f, 163.16f, 49.73f, 162.59f, 50.06f)
                lineTo(135.11f, 65.96f)
                curveTo(134.54f, 66.29f, 133.83f, 65.88f, 133.83f, 65.22f)
                verticalLineTo(55.64f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF9AF4FF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(133.33f, 136.13f)
                curveTo(133.33f, 135.09f, 134.46f, 134.44f, 135.36f, 134.96f)
                lineTo(162.84f, 150.86f)
                curveTo(163.74f, 151.38f, 163.74f, 152.68f, 162.84f, 153.2f)
                lineTo(135.36f, 169.1f)
                curveTo(134.46f, 169.62f, 133.33f, 168.97f, 133.33f, 167.93f)
                verticalLineTo(158.35f)
                horizontalLineTo(98.65f)
                verticalLineTo(145.71f)
                horizontalLineTo(133.33f)
                verticalLineTo(136.13f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.87f,
                strokeLineWidth = 1f
            ) {
                moveTo(133.83f, 158.35f)
                verticalLineTo(157.85f)
                horizontalLineTo(133.33f)
                horizontalLineTo(99.15f)
                verticalLineTo(146.21f)
                horizontalLineTo(133.33f)
                horizontalLineTo(133.83f)
                verticalLineTo(145.71f)
                verticalLineTo(136.13f)
                curveTo(133.83f, 135.47f, 134.54f, 135.06f, 135.11f, 135.39f)
                lineTo(162.59f, 151.29f)
                curveTo(163.16f, 151.62f, 163.16f, 152.44f, 162.59f, 152.76f)
                lineTo(135.11f, 168.66f)
                curveTo(134.54f, 168.99f, 133.83f, 168.58f, 133.83f, 167.93f)
                verticalLineTo(158.35f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF9AF4FF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(161.71f, 84.78f)
                curveTo(161.71f, 83.73f, 162.84f, 83.08f, 163.74f, 83.61f)
                lineTo(191.22f, 99.51f)
                curveTo(192.12f, 100.03f, 192.12f, 101.32f, 191.22f, 101.85f)
                lineTo(163.74f, 117.75f)
                curveTo(162.84f, 118.27f, 161.71f, 117.62f, 161.71f, 116.58f)
                verticalLineTo(107f)
                horizontalLineTo(127.03f)
                verticalLineTo(94.36f)
                horizontalLineTo(161.71f)
                verticalLineTo(84.78f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.87f,
                strokeLineWidth = 1f
            ) {
                moveTo(162.21f, 107f)
                verticalLineTo(106.5f)
                horizontalLineTo(161.71f)
                horizontalLineTo(127.53f)
                verticalLineTo(94.86f)
                horizontalLineTo(161.71f)
                horizontalLineTo(162.21f)
                verticalLineTo(94.36f)
                verticalLineTo(84.78f)
                curveTo(162.21f, 84.12f, 162.92f, 83.71f, 163.49f, 84.04f)
                lineTo(190.97f, 99.94f)
                curveTo(191.54f, 100.27f, 191.54f, 101.08f, 190.97f, 101.41f)
                lineTo(163.49f, 117.31f)
                curveTo(162.92f, 117.64f, 162.21f, 117.23f, 162.21f, 116.58f)
                verticalLineTo(107f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF4E041))) {
                moveTo(28.38f, 18.92f)
                lineTo(94.59f, 18.92f)
                arcTo(10.81f, 10.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, 105.41f, 29.73f)
                lineTo(105.41f, 168.92f)
                arcTo(10.81f, 10.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, 94.59f, 179.73f)
                lineTo(28.38f, 179.73f)
                arcTo(10.81f, 10.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.57f, 168.92f)
                lineTo(17.57f, 29.73f)
                arcTo(10.81f, 10.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, 28.38f, 18.92f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.87f,
                strokeLineWidth = 1f
            ) {
                moveTo(28.38f, 19.42f)
                lineTo(94.59f, 19.42f)
                arcTo(10.31f, 10.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 104.91f, 29.73f)
                lineTo(104.91f, 168.92f)
                arcTo(10.31f, 10.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 94.59f, 179.23f)
                lineTo(28.38f, 179.23f)
                arcTo(10.31f, 10.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.07f, 168.92f)
                lineTo(18.07f, 29.73f)
                arcTo(10.31f, 10.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 28.38f, 19.42f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(33.78f, 28.38f)
                lineTo(89.19f, 28.38f)
                arcTo(6.76f, 6.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 95.95f, 35.14f)
                lineTo(95.95f, 35.14f)
                arcTo(6.76f, 6.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 89.19f, 41.89f)
                lineTo(33.78f, 41.89f)
                arcTo(6.76f, 6.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 27.03f, 35.14f)
                lineTo(27.03f, 35.14f)
                arcTo(6.76f, 6.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 33.78f, 28.38f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.87f,
                strokeLineWidth = 1f
            ) {
                moveTo(33.78f, 28.88f)
                lineTo(89.19f, 28.88f)
                arcTo(6.26f, 6.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 95.45f, 35.14f)
                lineTo(95.45f, 35.14f)
                arcTo(6.26f, 6.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 89.19f, 41.39f)
                lineTo(33.78f, 41.39f)
                arcTo(6.26f, 6.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 27.53f, 35.14f)
                lineTo(27.53f, 35.14f)
                arcTo(6.26f, 6.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 33.78f, 28.88f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(33.78f, 47.3f)
                lineTo(89.19f, 47.3f)
                arcTo(6.76f, 6.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 95.95f, 54.05f)
                lineTo(95.95f, 54.05f)
                arcTo(6.76f, 6.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 89.19f, 60.81f)
                lineTo(33.78f, 60.81f)
                arcTo(6.76f, 6.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 27.03f, 54.05f)
                lineTo(27.03f, 54.05f)
                arcTo(6.76f, 6.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 33.78f, 47.3f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.87f,
                strokeLineWidth = 1f
            ) {
                moveTo(33.78f, 47.8f)
                lineTo(89.19f, 47.8f)
                arcTo(6.26f, 6.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 95.45f, 54.05f)
                lineTo(95.45f, 54.05f)
                arcTo(6.26f, 6.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 89.19f, 60.31f)
                lineTo(33.78f, 60.31f)
                arcTo(6.26f, 6.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 27.53f, 54.05f)
                lineTo(27.53f, 54.05f)
                arcTo(6.26f, 6.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 33.78f, 47.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(33.78f, 66.22f)
                lineTo(89.19f, 66.22f)
                arcTo(6.76f, 6.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 95.95f, 72.97f)
                lineTo(95.95f, 72.97f)
                arcTo(6.76f, 6.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 89.19f, 79.73f)
                lineTo(33.78f, 79.73f)
                arcTo(6.76f, 6.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 27.03f, 72.97f)
                lineTo(27.03f, 72.97f)
                arcTo(6.76f, 6.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 33.78f, 66.22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.87f,
                strokeLineWidth = 1f
            ) {
                moveTo(33.78f, 66.72f)
                lineTo(89.19f, 66.72f)
                arcTo(6.26f, 6.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 95.45f, 72.97f)
                lineTo(95.45f, 72.97f)
                arcTo(6.26f, 6.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 89.19f, 79.23f)
                lineTo(33.78f, 79.23f)
                arcTo(6.26f, 6.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 27.53f, 72.97f)
                lineTo(27.53f, 72.97f)
                arcTo(6.26f, 6.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 33.78f, 66.72f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(33.78f, 141.89f)
                lineTo(89.19f, 141.89f)
                arcTo(6.76f, 6.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 95.95f, 148.65f)
                lineTo(95.95f, 148.65f)
                arcTo(6.76f, 6.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 89.19f, 155.41f)
                lineTo(33.78f, 155.41f)
                arcTo(6.76f, 6.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 27.03f, 148.65f)
                lineTo(27.03f, 148.65f)
                arcTo(6.76f, 6.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 33.78f, 141.89f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.87f,
                strokeLineWidth = 1f
            ) {
                moveTo(33.78f, 142.39f)
                lineTo(89.19f, 142.39f)
                arcTo(6.26f, 6.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 95.45f, 148.65f)
                lineTo(95.45f, 148.65f)
                arcTo(6.26f, 6.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 89.19f, 154.91f)
                lineTo(33.78f, 154.91f)
                arcTo(6.26f, 6.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 27.53f, 148.65f)
                lineTo(27.53f, 148.65f)
                arcTo(6.26f, 6.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 33.78f, 142.39f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(47.3f, 160.81f)
                lineTo(77.03f, 160.81f)
                arcTo(5.41f, 5.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 82.43f, 166.22f)
                lineTo(82.43f, 166.22f)
                arcTo(5.41f, 5.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 77.03f, 171.62f)
                lineTo(47.3f, 171.62f)
                arcTo(5.41f, 5.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 41.89f, 166.22f)
                lineTo(41.89f, 166.22f)
                arcTo(5.41f, 5.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 47.3f, 160.81f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.87f,
                strokeLineWidth = 1f
            ) {
                moveTo(47.3f, 161.31f)
                lineTo(77.03f, 161.31f)
                arcTo(4.91f, 4.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 81.93f, 166.22f)
                lineTo(81.93f, 166.22f)
                arcTo(4.91f, 4.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 77.03f, 171.12f)
                lineTo(47.3f, 171.12f)
                arcTo(4.91f, 4.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 42.39f, 166.22f)
                lineTo(42.39f, 166.22f)
                arcTo(4.91f, 4.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 47.3f, 161.31f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(29.73f, 86.49f)
                lineTo(51.35f, 86.49f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 54.05f, 89.19f)
                lineTo(54.05f, 89.19f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 51.35f, 91.89f)
                lineTo(29.73f, 91.89f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 27.03f, 89.19f)
                lineTo(27.03f, 89.19f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 29.73f, 86.49f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.87f,
                strokeLineWidth = 1f
            ) {
                moveTo(29.73f, 86.99f)
                lineTo(51.35f, 86.99f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 53.55f, 89.19f)
                lineTo(53.55f, 89.19f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 51.35f, 91.39f)
                lineTo(29.73f, 91.39f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 27.53f, 89.19f)
                lineTo(27.53f, 89.19f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 29.73f, 86.99f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(40.54f, 97.3f)
                lineTo(62.16f, 97.3f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64.86f, 100f)
                lineTo(64.86f, 100f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 62.16f, 102.7f)
                lineTo(40.54f, 102.7f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 37.84f, 100f)
                lineTo(37.84f, 100f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40.54f, 97.3f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.87f,
                strokeLineWidth = 1f
            ) {
                moveTo(40.54f, 97.8f)
                lineTo(62.16f, 97.8f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64.36f, 100f)
                lineTo(64.36f, 100f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 62.16f, 102.2f)
                lineTo(40.54f, 102.2f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 38.34f, 100f)
                lineTo(38.34f, 100f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40.54f, 97.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(29.73f, 97.3f)
                lineTo(29.73f, 97.3f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32.43f, 100f)
                lineTo(32.43f, 100f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 29.73f, 102.7f)
                lineTo(29.73f, 102.7f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 27.03f, 100f)
                lineTo(27.03f, 100f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 29.73f, 97.3f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.87f,
                strokeLineWidth = 1f
            ) {
                moveTo(29.73f, 97.8f)
                lineTo(29.73f, 97.8f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 31.93f, 100f)
                lineTo(31.93f, 100f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 29.73f, 102.2f)
                lineTo(29.73f, 102.2f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 27.53f, 100f)
                lineTo(27.53f, 100f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 29.73f, 97.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(40.54f, 108.11f)
                lineTo(62.16f, 108.11f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64.86f, 110.81f)
                lineTo(64.86f, 110.81f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 62.16f, 113.51f)
                lineTo(40.54f, 113.51f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 37.84f, 110.81f)
                lineTo(37.84f, 110.81f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40.54f, 108.11f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.87f,
                strokeLineWidth = 1f
            ) {
                moveTo(40.54f, 108.61f)
                lineTo(62.16f, 108.61f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64.36f, 110.81f)
                lineTo(64.36f, 110.81f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 62.16f, 113.01f)
                lineTo(40.54f, 113.01f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 38.34f, 110.81f)
                lineTo(38.34f, 110.81f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40.54f, 108.61f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(29.73f, 108.11f)
                lineTo(29.73f, 108.11f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32.43f, 110.81f)
                lineTo(32.43f, 110.81f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 29.73f, 113.51f)
                lineTo(29.73f, 113.51f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 27.03f, 110.81f)
                lineTo(27.03f, 110.81f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 29.73f, 108.11f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.87f,
                strokeLineWidth = 1f
            ) {
                moveTo(29.73f, 108.61f)
                lineTo(29.73f, 108.61f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 31.93f, 110.81f)
                lineTo(31.93f, 110.81f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 29.73f, 113.01f)
                lineTo(29.73f, 113.01f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 27.53f, 110.81f)
                lineTo(27.53f, 110.81f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 29.73f, 108.61f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(40.54f, 118.92f)
                lineTo(62.16f, 118.92f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64.86f, 121.62f)
                lineTo(64.86f, 121.62f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 62.16f, 124.32f)
                lineTo(40.54f, 124.32f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 37.84f, 121.62f)
                lineTo(37.84f, 121.62f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40.54f, 118.92f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.87f,
                strokeLineWidth = 1f
            ) {
                moveTo(40.54f, 119.42f)
                lineTo(62.16f, 119.42f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64.36f, 121.62f)
                lineTo(64.36f, 121.62f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 62.16f, 123.82f)
                lineTo(40.54f, 123.82f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 38.34f, 121.62f)
                lineTo(38.34f, 121.62f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40.54f, 119.42f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(29.73f, 118.92f)
                lineTo(29.73f, 118.92f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32.43f, 121.62f)
                lineTo(32.43f, 121.62f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 29.73f, 124.32f)
                lineTo(29.73f, 124.32f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 27.03f, 121.62f)
                lineTo(27.03f, 121.62f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 29.73f, 118.92f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.87f,
                strokeLineWidth = 1f
            ) {
                moveTo(29.73f, 119.42f)
                lineTo(29.73f, 119.42f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 31.93f, 121.62f)
                lineTo(31.93f, 121.62f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 29.73f, 123.82f)
                lineTo(29.73f, 123.82f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 27.53f, 121.62f)
                lineTo(27.53f, 121.62f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 29.73f, 119.42f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(40.54f, 129.73f)
                lineTo(62.16f, 129.73f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64.86f, 132.43f)
                lineTo(64.86f, 132.43f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 62.16f, 135.14f)
                lineTo(40.54f, 135.14f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 37.84f, 132.43f)
                lineTo(37.84f, 132.43f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40.54f, 129.73f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.87f,
                strokeLineWidth = 1f
            ) {
                moveTo(40.54f, 130.23f)
                lineTo(62.16f, 130.23f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64.36f, 132.43f)
                lineTo(64.36f, 132.43f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 62.16f, 134.64f)
                lineTo(40.54f, 134.64f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 38.34f, 132.43f)
                lineTo(38.34f, 132.43f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40.54f, 130.23f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(29.73f, 129.73f)
                lineTo(29.73f, 129.73f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32.43f, 132.43f)
                lineTo(32.43f, 132.43f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 29.73f, 135.14f)
                lineTo(29.73f, 135.14f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 27.03f, 132.43f)
                lineTo(27.03f, 132.43f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 29.73f, 129.73f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.87f,
                strokeLineWidth = 1f
            ) {
                moveTo(29.73f, 130.23f)
                lineTo(29.73f, 130.23f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 31.93f, 132.43f)
                lineTo(31.93f, 132.43f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 29.73f, 134.64f)
                lineTo(29.73f, 134.64f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 27.53f, 132.43f)
                lineTo(27.53f, 132.43f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 29.73f, 130.23f)
                close()
            }
            path(fill = SolidColor(Color(0xFF38DA6F))) {
                moveTo(140.94f, 99.47f)
                curveTo(140.94f, 119.33f, 124.83f, 135.43f, 104.96f, 135.43f)
                curveTo(85.08f, 135.43f, 68.98f, 119.33f, 68.98f, 99.47f)
                curveTo(68.98f, 79.61f, 85.08f, 63.51f, 104.96f, 63.51f)
                curveTo(124.83f, 63.51f, 140.94f, 79.61f, 140.94f, 99.47f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.87f,
                strokeLineWidth = 1f
            ) {
                moveTo(140.44f, 99.47f)
                curveTo(140.44f, 119.06f, 124.55f, 134.93f, 104.96f, 134.93f)
                curveTo(85.36f, 134.93f, 69.48f, 119.06f, 69.48f, 99.47f)
                curveTo(69.48f, 79.89f, 85.36f, 64.01f, 104.96f, 64.01f)
                curveTo(124.55f, 64.01f, 140.44f, 79.89f, 140.44f, 99.47f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(97.68f, 110.13f)
                lineTo(89.13f, 101.5f)
                curveTo(88.18f, 100.54f, 86.67f, 100.54f, 85.71f, 101.5f)
                curveTo(84.76f, 102.46f, 84.76f, 103.99f, 85.71f, 104.95f)
                lineTo(95.95f, 115.28f)
                curveTo(96.9f, 116.24f, 98.44f, 116.24f, 99.39f, 115.28f)
                lineTo(125.29f, 89.17f)
                curveTo(126.24f, 88.21f, 126.24f, 86.68f, 125.29f, 85.72f)
                curveTo(124.33f, 84.76f, 122.82f, 84.76f, 121.87f, 85.72f)
                lineTo(97.68f, 110.13f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.87f,
                strokeLineWidth = 1.35135f
            ) {
                moveTo(125.76f, 89.65f)
                lineTo(125.76f, 89.65f)
                curveTo(126.98f, 88.42f, 126.98f, 86.47f, 125.76f, 85.25f)
                curveTo(124.55f, 84.02f, 122.6f, 84.02f, 121.39f, 85.25f)
                lineTo(97.68f, 109.17f)
                lineTo(89.61f, 101.02f)
                curveTo(88.4f, 99.79f, 86.45f, 99.79f, 85.23f, 101.02f)
                curveTo(84.02f, 102.25f, 84.02f, 104.2f, 85.23f, 105.43f)
                lineTo(95.47f, 115.75f)
                curveTo(96.69f, 116.98f, 98.66f, 116.98f, 99.87f, 115.75f)
                curveTo(99.87f, 115.75f, 99.87f, 115.75f, 99.87f, 115.75f)
                lineTo(125.76f, 89.65f)
                close()
            }
        }.build()

        return _SuccessImage!!
    }

@Suppress("ObjectPropertyName")
private var _SuccessImage: ImageVector? = null
