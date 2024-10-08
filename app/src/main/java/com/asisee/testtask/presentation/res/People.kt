package com.asisee.testtask.presentation.res

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val People: ImageVector
    get() {
        if (_People != null) {
            return _People!!
        }
        _People = ImageVector.Builder(
            name = "People",
            defaultWidth = 25.dp,
            defaultHeight = 24.dp,
            viewportWidth = 25f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.6f
            ) {
                moveTo(16.5f, 11f)
                curveTo(18.16f, 11f, 19.49f, 9.66f, 19.49f, 8f)
                curveTo(19.49f, 6.34f, 18.16f, 5f, 16.5f, 5f)
                curveTo(14.84f, 5f, 13.5f, 6.34f, 13.5f, 8f)
                curveTo(13.5f, 9.66f, 14.84f, 11f, 16.5f, 11f)
                close()
                moveTo(8.5f, 11f)
                curveTo(10.16f, 11f, 11.49f, 9.66f, 11.49f, 8f)
                curveTo(11.49f, 6.34f, 10.16f, 5f, 8.5f, 5f)
                curveTo(6.84f, 5f, 5.5f, 6.34f, 5.5f, 8f)
                curveTo(5.5f, 9.66f, 6.84f, 11f, 8.5f, 11f)
                close()
                moveTo(8.5f, 13f)
                curveTo(6.17f, 13f, 1.5f, 14.17f, 1.5f, 16.5f)
                verticalLineTo(19f)
                horizontalLineTo(15.5f)
                verticalLineTo(16.5f)
                curveTo(15.5f, 14.17f, 10.83f, 13f, 8.5f, 13f)
                close()
                moveTo(16.5f, 13f)
                curveTo(16.21f, 13f, 15.88f, 13.02f, 15.53f, 13.05f)
                curveTo(16.69f, 13.89f, 17.5f, 15.02f, 17.5f, 16.5f)
                verticalLineTo(19f)
                horizontalLineTo(23.5f)
                verticalLineTo(16.5f)
                curveTo(23.5f, 14.17f, 18.83f, 13f, 16.5f, 13f)
                close()
            }
        }.build()

        return _People!!
    }

@Suppress("ObjectPropertyName")
private var _People: ImageVector? = null
