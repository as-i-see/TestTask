package com.asisee.testtask.presentation.res

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val PersonAdd: ImageVector
    get() {
        if (_PersonAdd != null) {
            return _PersonAdd!!
        }
        _PersonAdd = ImageVector.Builder(
            name = "PersonAdd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.6f
            ) {
                moveTo(13f, 8f)
                curveTo(13f, 5.79f, 11.21f, 4f, 9f, 4f)
                curveTo(6.79f, 4f, 5f, 5.79f, 5f, 8f)
                curveTo(5f, 10.21f, 6.79f, 12f, 9f, 12f)
                curveTo(11.21f, 12f, 13f, 10.21f, 13f, 8f)
                close()
                moveTo(15f, 10f)
                verticalLineTo(12f)
                horizontalLineTo(18f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(12f)
                horizontalLineTo(23f)
                verticalLineTo(10f)
                horizontalLineTo(20f)
                verticalLineTo(7f)
                horizontalLineTo(18f)
                verticalLineTo(10f)
                horizontalLineTo(15f)
                close()
                moveTo(1f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(17f)
                verticalLineTo(18f)
                curveTo(17f, 15.34f, 11.67f, 14f, 9f, 14f)
                curveTo(6.33f, 14f, 1f, 15.34f, 1f, 18f)
                close()
            }
        }.build()

        return _PersonAdd!!
    }

@Suppress("ObjectPropertyName")
private var _PersonAdd: ImageVector? = null
