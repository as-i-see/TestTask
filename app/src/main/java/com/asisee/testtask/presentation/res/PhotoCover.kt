package com.asisee.testtask.presentation.res

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.LazyThreadSafetyMode

val PhotoCover: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PhotoCover",
        defaultWidth = 70.dp,
        defaultHeight = 70.dp,
        viewportWidth = 70f,
        viewportHeight = 70f
    ).apply {
        path(fill = SolidColor(Color(0xFFFFFFFF))) {
            moveTo(35f, 35f)
            moveToRelative(-35f, 0f)
            arcToRelative(35f, 35f, 0f, isMoreThanHalf = true, isPositiveArc = true, 70f, 0f)
            arcToRelative(35f, 35f, 0f, isMoreThanHalf = true, isPositiveArc = true, -70f, 0f)
        }
        path(fill = SolidColor(Color(0xFFD0CFCF))) {
            moveTo(34.952f, 70f)
            curveTo(15.63f, 70.002f, -0.075f, 54.242f, 0f, 34.93f)
            curveTo(0.078f, 15.579f, 15.724f, -0.034f, 35.005f, 0f)
            curveTo(54.359f, 0.036f, 69.944f, 15.593f, 70f, 34.937f)
            curveTo(70.057f, 54.305f, 54.368f, 70f, 34.952f, 70f)
            close()
            moveTo(11.244f, 57.555f)
            curveTo(24.149f, 71.321f, 46.16f, 71.066f, 58.715f, 57.564f)
            curveTo(58.45f, 57.258f, 58.198f, 56.931f, 57.908f, 56.639f)
            curveTo(56.601f, 55.325f, 55.054f, 54.337f, 53.381f, 53.592f)
            curveTo(51.196f, 52.618f, 48.945f, 51.792f, 46.738f, 50.867f)
            curveTo(45.692f, 50.427f, 44.647f, 49.965f, 43.664f, 49.403f)
            curveTo(42.542f, 48.764f, 41.815f, 47.803f, 41.783f, 46.431f)
            curveTo(41.758f, 45.325f, 41.722f, 44.216f, 41.671f, 43.109f)
            curveTo(41.637f, 42.389f, 41.833f, 41.771f, 42.282f, 41.194f)
            curveTo(43.984f, 38.989f, 44.872f, 36.485f, 44.888f, 33.692f)
            curveTo(44.89f, 33.252f, 45.073f, 32.986f, 45.404f, 32.725f)
            curveTo(46.142f, 32.14f, 46.797f, 31.451f, 46.995f, 30.498f)
            curveTo(47.208f, 29.476f, 47.359f, 28.436f, 47.456f, 27.393f)
            curveTo(47.535f, 26.546f, 47.444f, 25.718f, 46.366f, 25.629f)
            curveTo(46.517f, 24.35f, 46.716f, 23.167f, 46.787f, 21.979f)
            curveTo(46.927f, 19.553f, 46.664f, 17.182f, 45.442f, 15.015f)
            curveTo(44.389f, 13.149f, 42.802f, 12.125f, 40.631f, 12.042f)
            curveTo(40.343f, 12.031f, 40.048f, 11.943f, 39.772f, 11.847f)
            curveTo(37.022f, 10.902f, 34.182f, 10.613f, 31.351f, 11.178f)
            curveTo(25.84f, 12.276f, 22.542f, 17.013f, 23.205f, 22.652f)
            curveTo(23.32f, 23.626f, 23.505f, 24.591f, 23.669f, 25.635f)
            curveTo(22.913f, 25.674f, 22.468f, 26.11f, 22.483f, 26.83f)
            curveTo(22.522f, 28.97f, 22.562f, 31.134f, 24.455f, 32.644f)
            curveTo(24.929f, 33.022f, 25.049f, 33.497f, 25.098f, 34.055f)
            curveTo(25.166f, 34.856f, 25.258f, 35.659f, 25.386f, 36.453f)
            curveTo(25.685f, 38.317f, 26.772f, 39.806f, 27.747f, 41.352f)
            curveTo(27.989f, 41.735f, 28.185f, 42.218f, 28.203f, 42.662f)
            curveTo(28.251f, 43.888f, 28.203f, 45.118f, 28.176f, 46.345f)
            curveTo(28.149f, 47.576f, 27.584f, 48.527f, 26.577f, 49.209f)
            curveTo(26.108f, 49.527f, 25.627f, 49.85f, 25.109f, 50.069f)
            curveTo(23.87f, 50.597f, 22.612f, 51.083f, 21.352f, 51.556f)
            curveTo(18.743f, 52.539f, 16.158f, 53.572f, 13.838f, 55.159f)
            curveTo(12.866f, 55.824f, 11.968f, 56.563f, 11.244f, 57.555f)
            close()
        }
    }.build()
}
