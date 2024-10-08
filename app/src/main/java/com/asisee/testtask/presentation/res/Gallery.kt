package com.asisee.testtask.presentation.res

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val Gallery: ImageVector
    get() {
        if (_Gallery != null) {
            return _Gallery!!
        }
        _Gallery = ImageVector.Builder(
            name = "Gallery",
            defaultWidth = 56.dp,
            defaultHeight = 56.dp,
            viewportWidth = 56f,
            viewportHeight = 56f
        ).apply {
            path(fill = SolidColor(Color(0xFFF57C00))) {
                moveTo(50.4f, 51.6f)
                horizontalLineTo(5.6f)
                curveTo(2.52f, 51.6f, 0f, 49.08f, 0f, 46f)
                verticalLineTo(9.6f)
                curveTo(0f, 6.52f, 2.52f, 4f, 5.6f, 4f)
                horizontalLineTo(50.4f)
                curveTo(53.48f, 4f, 56f, 6.52f, 56f, 9.6f)
                verticalLineTo(46f)
                curveTo(56f, 49.08f, 53.48f, 51.6f, 50.4f, 51.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFF9C4))) {
                moveTo(43.4f, 20.8f)
                curveTo(45.72f, 20.8f, 47.6f, 18.92f, 47.6f, 16.6f)
                curveTo(47.6f, 14.28f, 45.72f, 12.4f, 43.4f, 12.4f)
                curveTo(41.08f, 12.4f, 39.2f, 14.28f, 39.2f, 16.6f)
                curveTo(39.2f, 18.92f, 41.08f, 20.8f, 43.4f, 20.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF942A09))) {
                moveTo(22.4f, 16.6f)
                lineTo(7f, 39f)
                horizontalLineTo(37.8f)
                lineTo(22.4f, 16.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFBF360C))) {
                moveTo(37.8f, 25f)
                lineTo(26.6f, 39f)
                horizontalLineTo(49f)
                lineTo(37.8f, 25f)
                close()
            }
        }.build()

        return _Gallery!!
    }

@Suppress("ObjectPropertyName")
private var _Gallery: ImageVector? = null
