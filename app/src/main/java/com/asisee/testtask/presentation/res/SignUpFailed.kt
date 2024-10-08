package com.asisee.testtask.presentation.res

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val SignUpFailed: ImageVector
    get() {
        if (_SuccessImage2 != null) {
            return _SuccessImage2!!
        }
        _SuccessImage2 = ImageVector.Builder(
            name = "SignUpFailed",
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
                moveTo(68.56f, 33.42f)
                curveTo(68.56f, 32.38f, 67.43f, 31.73f, 66.53f, 32.25f)
                lineTo(39.05f, 48.15f)
                curveTo(38.15f, 48.67f, 38.15f, 49.97f, 39.05f, 50.49f)
                lineTo(66.53f, 66.39f)
                curveTo(67.43f, 66.92f, 68.56f, 66.27f, 68.56f, 65.22f)
                verticalLineTo(55.64f)
                horizontalLineTo(103.24f)
                verticalLineTo(43f)
                horizontalLineTo(68.56f)
                verticalLineTo(33.42f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.87f,
                strokeLineWidth = 1f
            ) {
                moveTo(68.06f, 55.64f)
                verticalLineTo(55.14f)
                horizontalLineTo(68.56f)
                horizontalLineTo(102.74f)
                verticalLineTo(43.5f)
                horizontalLineTo(68.56f)
                horizontalLineTo(68.06f)
                verticalLineTo(43f)
                verticalLineTo(33.42f)
                curveTo(68.06f, 32.77f, 67.35f, 32.36f, 66.78f, 32.69f)
                lineTo(39.3f, 48.59f)
                curveTo(38.73f, 48.92f, 38.73f, 49.73f, 39.3f, 50.06f)
                lineTo(66.78f, 65.96f)
                curveTo(67.35f, 66.29f, 68.06f, 65.88f, 68.06f, 65.22f)
                verticalLineTo(55.64f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF9AF4FF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(68.56f, 136.13f)
                curveTo(68.56f, 135.09f, 67.43f, 134.44f, 66.53f, 134.96f)
                lineTo(39.05f, 150.86f)
                curveTo(38.15f, 151.38f, 38.15f, 152.68f, 39.05f, 153.2f)
                lineTo(66.53f, 169.1f)
                curveTo(67.43f, 169.62f, 68.56f, 168.97f, 68.56f, 167.93f)
                verticalLineTo(158.35f)
                horizontalLineTo(103.24f)
                verticalLineTo(145.71f)
                horizontalLineTo(68.56f)
                verticalLineTo(136.13f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.87f,
                strokeLineWidth = 1f
            ) {
                moveTo(68.06f, 158.35f)
                verticalLineTo(157.85f)
                horizontalLineTo(68.56f)
                horizontalLineTo(102.74f)
                verticalLineTo(146.21f)
                horizontalLineTo(68.56f)
                horizontalLineTo(68.06f)
                verticalLineTo(145.71f)
                verticalLineTo(136.13f)
                curveTo(68.06f, 135.47f, 67.35f, 135.06f, 66.78f, 135.39f)
                lineTo(39.3f, 151.29f)
                curveTo(38.73f, 151.62f, 38.73f, 152.44f, 39.3f, 152.76f)
                lineTo(66.78f, 168.66f)
                curveTo(67.35f, 168.99f, 68.06f, 168.58f, 68.06f, 167.93f)
                verticalLineTo(158.35f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF9AF4FF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(40.18f, 84.78f)
                curveTo(40.18f, 83.73f, 39.05f, 83.08f, 38.15f, 83.61f)
                lineTo(10.67f, 99.51f)
                curveTo(9.77f, 100.03f, 9.77f, 101.32f, 10.67f, 101.85f)
                lineTo(38.15f, 117.75f)
                curveTo(39.05f, 118.27f, 40.18f, 117.62f, 40.18f, 116.58f)
                verticalLineTo(107f)
                horizontalLineTo(74.86f)
                verticalLineTo(94.36f)
                horizontalLineTo(40.18f)
                verticalLineTo(84.78f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.87f,
                strokeLineWidth = 1f
            ) {
                moveTo(39.68f, 107f)
                verticalLineTo(106.5f)
                horizontalLineTo(40.18f)
                horizontalLineTo(74.36f)
                verticalLineTo(94.86f)
                horizontalLineTo(40.18f)
                horizontalLineTo(39.68f)
                verticalLineTo(94.36f)
                verticalLineTo(84.78f)
                curveTo(39.68f, 84.12f, 38.97f, 83.71f, 38.4f, 84.04f)
                lineTo(10.92f, 99.94f)
                curveTo(10.35f, 100.27f, 10.35f, 101.08f, 10.92f, 101.41f)
                lineTo(38.4f, 117.31f)
                curveTo(38.97f, 117.64f, 39.68f, 117.23f, 39.68f, 116.58f)
                verticalLineTo(107f)
                close()
            }
            path(fill = SolidColor(Color(0xFFD7D7D7))) {
                moveTo(104.81f, 18.92f)
                lineTo(171.03f, 18.92f)
                arcTo(10.81f, 10.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, 181.84f, 29.73f)
                lineTo(181.84f, 168.92f)
                arcTo(10.81f, 10.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, 171.03f, 179.73f)
                lineTo(104.81f, 179.73f)
                arcTo(10.81f, 10.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, 94f, 168.92f)
                lineTo(94f, 29.73f)
                arcTo(10.81f, 10.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, 104.81f, 18.92f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.87f,
                strokeLineWidth = 1f
            ) {
                moveTo(104.81f, 19.42f)
                lineTo(171.03f, 19.42f)
                arcTo(10.31f, 10.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 181.34f, 29.73f)
                lineTo(181.34f, 168.92f)
                arcTo(10.31f, 10.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 171.03f, 179.23f)
                lineTo(104.81f, 179.23f)
                arcTo(10.31f, 10.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 94.5f, 168.92f)
                lineTo(94.5f, 29.73f)
                arcTo(10.31f, 10.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 104.81f, 19.42f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(110.22f, 28.38f)
                lineTo(165.62f, 28.38f)
                arcTo(6.76f, 6.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 172.38f, 35.14f)
                lineTo(172.38f, 35.14f)
                arcTo(6.76f, 6.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 165.62f, 41.89f)
                lineTo(110.22f, 41.89f)
                arcTo(6.76f, 6.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 103.46f, 35.14f)
                lineTo(103.46f, 35.14f)
                arcTo(6.76f, 6.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 110.22f, 28.38f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.87f,
                strokeLineWidth = 1f
            ) {
                moveTo(110.22f, 28.88f)
                lineTo(165.62f, 28.88f)
                arcTo(6.26f, 6.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 171.88f, 35.14f)
                lineTo(171.88f, 35.14f)
                arcTo(6.26f, 6.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 165.62f, 41.39f)
                lineTo(110.22f, 41.39f)
                arcTo(6.26f, 6.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 103.96f, 35.14f)
                lineTo(103.96f, 35.14f)
                arcTo(6.26f, 6.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 110.22f, 28.88f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(110.22f, 47.3f)
                lineTo(165.62f, 47.3f)
                arcTo(6.76f, 6.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 172.38f, 54.05f)
                lineTo(172.38f, 54.05f)
                arcTo(6.76f, 6.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 165.62f, 60.81f)
                lineTo(110.22f, 60.81f)
                arcTo(6.76f, 6.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 103.46f, 54.05f)
                lineTo(103.46f, 54.05f)
                arcTo(6.76f, 6.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 110.22f, 47.3f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.87f,
                strokeLineWidth = 1f
            ) {
                moveTo(110.22f, 47.8f)
                lineTo(165.62f, 47.8f)
                arcTo(6.26f, 6.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 171.88f, 54.05f)
                lineTo(171.88f, 54.05f)
                arcTo(6.26f, 6.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 165.62f, 60.31f)
                lineTo(110.22f, 60.31f)
                arcTo(6.26f, 6.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 103.96f, 54.05f)
                lineTo(103.96f, 54.05f)
                arcTo(6.26f, 6.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 110.22f, 47.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(110.22f, 66.22f)
                lineTo(165.62f, 66.22f)
                arcTo(6.76f, 6.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 172.38f, 72.97f)
                lineTo(172.38f, 72.97f)
                arcTo(6.76f, 6.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 165.62f, 79.73f)
                lineTo(110.22f, 79.73f)
                arcTo(6.76f, 6.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 103.46f, 72.97f)
                lineTo(103.46f, 72.97f)
                arcTo(6.76f, 6.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 110.22f, 66.22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.87f,
                strokeLineWidth = 1f
            ) {
                moveTo(110.22f, 66.72f)
                lineTo(165.62f, 66.72f)
                arcTo(6.26f, 6.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 171.88f, 72.97f)
                lineTo(171.88f, 72.97f)
                arcTo(6.26f, 6.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 165.62f, 79.23f)
                lineTo(110.22f, 79.23f)
                arcTo(6.26f, 6.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 103.96f, 72.97f)
                lineTo(103.96f, 72.97f)
                arcTo(6.26f, 6.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 110.22f, 66.72f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(110.22f, 141.89f)
                lineTo(165.62f, 141.89f)
                arcTo(6.76f, 6.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 172.38f, 148.65f)
                lineTo(172.38f, 148.65f)
                arcTo(6.76f, 6.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 165.62f, 155.41f)
                lineTo(110.22f, 155.41f)
                arcTo(6.76f, 6.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 103.46f, 148.65f)
                lineTo(103.46f, 148.65f)
                arcTo(6.76f, 6.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 110.22f, 141.89f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.87f,
                strokeLineWidth = 1f
            ) {
                moveTo(110.22f, 142.39f)
                lineTo(165.62f, 142.39f)
                arcTo(6.26f, 6.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 171.88f, 148.65f)
                lineTo(171.88f, 148.65f)
                arcTo(6.26f, 6.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 165.62f, 154.91f)
                lineTo(110.22f, 154.91f)
                arcTo(6.26f, 6.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 103.96f, 148.65f)
                lineTo(103.96f, 148.65f)
                arcTo(6.26f, 6.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 110.22f, 142.39f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(123.73f, 160.81f)
                lineTo(153.46f, 160.81f)
                arcTo(5.41f, 5.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 158.86f, 166.22f)
                lineTo(158.86f, 166.22f)
                arcTo(5.41f, 5.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 153.46f, 171.62f)
                lineTo(123.73f, 171.62f)
                arcTo(5.41f, 5.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 118.32f, 166.22f)
                lineTo(118.32f, 166.22f)
                arcTo(5.41f, 5.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 123.73f, 160.81f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.87f,
                strokeLineWidth = 1f
            ) {
                moveTo(123.73f, 161.31f)
                lineTo(153.46f, 161.31f)
                arcTo(4.91f, 4.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 158.36f, 166.22f)
                lineTo(158.36f, 166.22f)
                arcTo(4.91f, 4.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 153.46f, 171.12f)
                lineTo(123.73f, 171.12f)
                arcTo(4.91f, 4.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 118.82f, 166.22f)
                lineTo(118.82f, 166.22f)
                arcTo(4.91f, 4.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 123.73f, 161.31f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(106.16f, 86.49f)
                lineTo(127.78f, 86.49f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 130.49f, 89.19f)
                lineTo(130.49f, 89.19f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 127.78f, 91.89f)
                lineTo(106.16f, 91.89f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 103.46f, 89.19f)
                lineTo(103.46f, 89.19f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 106.16f, 86.49f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.87f,
                strokeLineWidth = 1f
            ) {
                moveTo(106.16f, 86.99f)
                lineTo(127.78f, 86.99f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 129.99f, 89.19f)
                lineTo(129.99f, 89.19f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 127.78f, 91.39f)
                lineTo(106.16f, 91.39f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 103.96f, 89.19f)
                lineTo(103.96f, 89.19f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 106.16f, 86.99f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(116.97f, 97.3f)
                lineTo(138.59f, 97.3f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 141.3f, 100f)
                lineTo(141.3f, 100f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 138.59f, 102.7f)
                lineTo(116.97f, 102.7f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 114.27f, 100f)
                lineTo(114.27f, 100f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 116.97f, 97.3f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.87f,
                strokeLineWidth = 1f
            ) {
                moveTo(116.97f, 97.8f)
                lineTo(138.59f, 97.8f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 140.8f, 100f)
                lineTo(140.8f, 100f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 138.59f, 102.2f)
                lineTo(116.97f, 102.2f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 114.77f, 100f)
                lineTo(114.77f, 100f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 116.97f, 97.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(106.16f, 97.3f)
                lineTo(106.16f, 97.3f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 108.86f, 100f)
                lineTo(108.86f, 100f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 106.16f, 102.7f)
                lineTo(106.16f, 102.7f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 103.46f, 100f)
                lineTo(103.46f, 100f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 106.16f, 97.3f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.87f,
                strokeLineWidth = 1f
            ) {
                moveTo(106.16f, 97.8f)
                lineTo(106.16f, 97.8f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 108.36f, 100f)
                lineTo(108.36f, 100f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 106.16f, 102.2f)
                lineTo(106.16f, 102.2f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 103.96f, 100f)
                lineTo(103.96f, 100f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 106.16f, 97.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(116.97f, 108.11f)
                lineTo(138.59f, 108.11f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 141.3f, 110.81f)
                lineTo(141.3f, 110.81f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 138.59f, 113.51f)
                lineTo(116.97f, 113.51f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 114.27f, 110.81f)
                lineTo(114.27f, 110.81f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 116.97f, 108.11f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.87f,
                strokeLineWidth = 1f
            ) {
                moveTo(116.97f, 108.61f)
                lineTo(138.59f, 108.61f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 140.8f, 110.81f)
                lineTo(140.8f, 110.81f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 138.59f, 113.01f)
                lineTo(116.97f, 113.01f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 114.77f, 110.81f)
                lineTo(114.77f, 110.81f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 116.97f, 108.61f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(106.16f, 108.11f)
                lineTo(106.16f, 108.11f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 108.86f, 110.81f)
                lineTo(108.86f, 110.81f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 106.16f, 113.51f)
                lineTo(106.16f, 113.51f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 103.46f, 110.81f)
                lineTo(103.46f, 110.81f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 106.16f, 108.11f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.87f,
                strokeLineWidth = 1f
            ) {
                moveTo(106.16f, 108.61f)
                lineTo(106.16f, 108.61f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 108.36f, 110.81f)
                lineTo(108.36f, 110.81f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 106.16f, 113.01f)
                lineTo(106.16f, 113.01f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 103.96f, 110.81f)
                lineTo(103.96f, 110.81f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 106.16f, 108.61f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(116.97f, 118.92f)
                lineTo(138.59f, 118.92f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 141.3f, 121.62f)
                lineTo(141.3f, 121.62f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 138.59f, 124.32f)
                lineTo(116.97f, 124.32f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 114.27f, 121.62f)
                lineTo(114.27f, 121.62f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 116.97f, 118.92f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.87f,
                strokeLineWidth = 1f
            ) {
                moveTo(116.97f, 119.42f)
                lineTo(138.59f, 119.42f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 140.8f, 121.62f)
                lineTo(140.8f, 121.62f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 138.59f, 123.82f)
                lineTo(116.97f, 123.82f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 114.77f, 121.62f)
                lineTo(114.77f, 121.62f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 116.97f, 119.42f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(106.16f, 118.92f)
                lineTo(106.16f, 118.92f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 108.86f, 121.62f)
                lineTo(108.86f, 121.62f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 106.16f, 124.32f)
                lineTo(106.16f, 124.32f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 103.46f, 121.62f)
                lineTo(103.46f, 121.62f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 106.16f, 118.92f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.87f,
                strokeLineWidth = 1f
            ) {
                moveTo(106.16f, 119.42f)
                lineTo(106.16f, 119.42f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 108.36f, 121.62f)
                lineTo(108.36f, 121.62f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 106.16f, 123.82f)
                lineTo(106.16f, 123.82f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 103.96f, 121.62f)
                lineTo(103.96f, 121.62f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 106.16f, 119.42f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(116.97f, 129.73f)
                lineTo(138.59f, 129.73f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 141.3f, 132.43f)
                lineTo(141.3f, 132.43f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 138.59f, 135.14f)
                lineTo(116.97f, 135.14f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 114.27f, 132.43f)
                lineTo(114.27f, 132.43f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 116.97f, 129.73f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.87f,
                strokeLineWidth = 1f
            ) {
                moveTo(116.97f, 130.23f)
                lineTo(138.59f, 130.23f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 140.8f, 132.43f)
                lineTo(140.8f, 132.43f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 138.59f, 134.64f)
                lineTo(116.97f, 134.64f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 114.77f, 132.43f)
                lineTo(114.77f, 132.43f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 116.97f, 130.23f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(106.16f, 129.73f)
                lineTo(106.16f, 129.73f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 108.86f, 132.43f)
                lineTo(108.86f, 132.43f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 106.16f, 135.14f)
                lineTo(106.16f, 135.14f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 103.46f, 132.43f)
                lineTo(103.46f, 132.43f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 106.16f, 129.73f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.87f,
                strokeLineWidth = 1f
            ) {
                moveTo(106.16f, 130.23f)
                lineTo(106.16f, 130.23f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 108.36f, 132.43f)
                lineTo(108.36f, 132.43f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 106.16f, 134.64f)
                lineTo(106.16f, 134.64f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 103.96f, 132.43f)
                lineTo(103.96f, 132.43f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 106.16f, 130.23f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFF4D4D)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.87f,
                strokeLineWidth = 1f
            ) {
                moveTo(100f, 100f)
                moveToRelative(-35f, 0f)
                arcToRelative(35f, 35f, 0f, isMoreThanHalf = true, isPositiveArc = true, 70f, 0f)
                arcToRelative(35f, 35f, 0f, isMoreThanHalf = true, isPositiveArc = true, -70f, 0f)
            }
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(83.99f, 84.46f)
                curveTo(82.45f, 86f, 82.45f, 88.5f, 83.99f, 90.04f)
                lineTo(94.45f, 100.49f)
                lineTo(83.99f, 110.95f)
                curveTo(82.45f, 112.49f, 82.45f, 114.99f, 83.99f, 116.53f)
                curveTo(85.53f, 118.07f, 88.03f, 118.07f, 89.57f, 116.53f)
                lineTo(100.03f, 106.07f)
                lineTo(110.48f, 116.53f)
                curveTo(112.02f, 118.07f, 114.52f, 118.07f, 116.06f, 116.53f)
                curveTo(117.6f, 114.99f, 117.6f, 112.49f, 116.06f, 110.95f)
                lineTo(105.6f, 100.49f)
                lineTo(116.06f, 90.04f)
                curveTo(117.6f, 88.5f, 117.6f, 86f, 116.06f, 84.46f)
                curveTo(114.52f, 82.92f, 112.02f, 82.92f, 110.48f, 84.46f)
                lineTo(100.03f, 94.92f)
                lineTo(89.57f, 84.46f)
                curveTo(88.03f, 82.92f, 85.53f, 82.92f, 83.99f, 84.46f)
                close()
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.87f
                ) {
                    moveTo(83.99f, 90.04f)
                    lineTo(84.7f, 89.33f)
                    lineTo(83.99f, 90.04f)
                    close()
                    moveTo(94.45f, 100.49f)
                    lineTo(95.16f, 101.2f)
                    lineTo(95.86f, 100.49f)
                    lineTo(95.16f, 99.79f)
                    lineTo(94.45f, 100.49f)
                    close()
                    moveTo(83.99f, 110.95f)
                    lineTo(84.7f, 111.66f)
                    lineTo(83.99f, 110.95f)
                    close()
                    moveTo(100.03f, 106.07f)
                    lineTo(100.73f, 105.36f)
                    lineTo(100.03f, 104.66f)
                    lineTo(99.32f, 105.36f)
                    lineTo(100.03f, 106.07f)
                    close()
                    moveTo(105.6f, 100.49f)
                    lineTo(104.9f, 99.79f)
                    lineTo(104.19f, 100.49f)
                    lineTo(104.9f, 101.2f)
                    lineTo(105.6f, 100.49f)
                    close()
                    moveTo(100.03f, 94.92f)
                    lineTo(99.32f, 95.62f)
                    lineTo(100.03f, 96.33f)
                    lineTo(100.73f, 95.62f)
                    lineTo(100.03f, 94.92f)
                    close()
                    moveTo(89.57f, 84.46f)
                    lineTo(90.28f, 83.75f)
                    lineTo(89.57f, 84.46f)
                    close()
                    moveTo(84.7f, 89.33f)
                    curveTo(83.55f, 88.18f, 83.55f, 86.32f, 84.7f, 85.17f)
                    lineTo(83.29f, 83.75f)
                    curveTo(81.35f, 85.68f, 81.35f, 88.81f, 83.29f, 90.74f)
                    lineTo(84.7f, 89.33f)
                    close()
                    moveTo(95.16f, 99.79f)
                    lineTo(84.7f, 89.33f)
                    lineTo(83.29f, 90.74f)
                    lineTo(93.74f, 101.2f)
                    lineTo(95.16f, 99.79f)
                    close()
                    moveTo(84.7f, 111.66f)
                    lineTo(95.16f, 101.2f)
                    lineTo(93.74f, 99.79f)
                    lineTo(83.29f, 110.24f)
                    lineTo(84.7f, 111.66f)
                    close()
                    moveTo(84.7f, 115.82f)
                    curveTo(83.55f, 114.67f, 83.55f, 112.81f, 84.7f, 111.66f)
                    lineTo(83.29f, 110.24f)
                    curveTo(81.35f, 112.17f, 81.35f, 115.3f, 83.29f, 117.23f)
                    lineTo(84.7f, 115.82f)
                    close()
                    moveTo(88.86f, 115.82f)
                    curveTo(87.71f, 116.97f, 85.85f, 116.97f, 84.7f, 115.82f)
                    lineTo(83.29f, 117.23f)
                    curveTo(85.22f, 119.17f, 88.35f, 119.17f, 90.28f, 117.23f)
                    lineTo(88.86f, 115.82f)
                    close()
                    moveTo(99.32f, 105.36f)
                    lineTo(88.86f, 115.82f)
                    lineTo(90.28f, 117.23f)
                    lineTo(100.73f, 106.78f)
                    lineTo(99.32f, 105.36f)
                    close()
                    moveTo(111.19f, 115.82f)
                    lineTo(100.73f, 105.36f)
                    lineTo(99.32f, 106.78f)
                    lineTo(109.78f, 117.23f)
                    lineTo(111.19f, 115.82f)
                    close()
                    moveTo(115.35f, 115.82f)
                    curveTo(114.2f, 116.97f, 112.34f, 116.97f, 111.19f, 115.82f)
                    lineTo(109.78f, 117.23f)
                    curveTo(111.71f, 119.17f, 114.84f, 119.17f, 116.77f, 117.23f)
                    lineTo(115.35f, 115.82f)
                    close()
                    moveTo(115.35f, 111.66f)
                    curveTo(116.5f, 112.81f, 116.5f, 114.67f, 115.35f, 115.82f)
                    lineTo(116.77f, 117.23f)
                    curveTo(118.7f, 115.3f, 118.7f, 112.17f, 116.77f, 110.24f)
                    lineTo(115.35f, 111.66f)
                    close()
                    moveTo(104.9f, 101.2f)
                    lineTo(115.35f, 111.66f)
                    lineTo(116.77f, 110.24f)
                    lineTo(106.31f, 99.79f)
                    lineTo(104.9f, 101.2f)
                    close()
                    moveTo(115.35f, 89.33f)
                    lineTo(104.9f, 99.79f)
                    lineTo(106.31f, 101.2f)
                    lineTo(116.77f, 90.74f)
                    lineTo(115.35f, 89.33f)
                    close()
                    moveTo(115.35f, 85.17f)
                    curveTo(116.5f, 86.32f, 116.5f, 88.18f, 115.35f, 89.33f)
                    lineTo(116.77f, 90.74f)
                    curveTo(118.7f, 88.81f, 118.7f, 85.68f, 116.77f, 83.75f)
                    lineTo(115.35f, 85.17f)
                    close()
                    moveTo(111.19f, 85.17f)
                    curveTo(112.34f, 84.02f, 114.2f, 84.02f, 115.35f, 85.17f)
                    lineTo(116.77f, 83.75f)
                    curveTo(114.84f, 81.82f, 111.71f, 81.82f, 109.78f, 83.75f)
                    lineTo(111.19f, 85.17f)
                    close()
                    moveTo(100.73f, 95.62f)
                    lineTo(111.19f, 85.17f)
                    lineTo(109.78f, 83.75f)
                    lineTo(99.32f, 94.21f)
                    lineTo(100.73f, 95.62f)
                    close()
                    moveTo(88.86f, 85.17f)
                    lineTo(99.32f, 95.62f)
                    lineTo(100.73f, 94.21f)
                    lineTo(90.28f, 83.75f)
                    lineTo(88.86f, 85.17f)
                    close()
                    moveTo(84.7f, 85.17f)
                    curveTo(85.85f, 84.02f, 87.71f, 84.02f, 88.86f, 85.17f)
                    lineTo(90.28f, 83.75f)
                    curveTo(88.35f, 81.82f, 85.22f, 81.82f, 83.29f, 83.75f)
                    lineTo(84.7f, 85.17f)
                    close()
                }
            }
        }.build()

        return _SuccessImage2!!
    }

@Suppress("ObjectPropertyName")
private var _SuccessImage2: ImageVector? = null
