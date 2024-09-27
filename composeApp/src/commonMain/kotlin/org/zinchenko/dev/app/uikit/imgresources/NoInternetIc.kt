package org.zinchenko.dev.app.uikit.imgresources

import androidx.compose.foundation.Image
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.zinchenko.dev.app.theme.AppTheme

val NoInternetIc: ImageVector
    @Composable
    get() {

        val onBackground = MaterialTheme.colorScheme.onBackground

        _NoInternetIc = remember(onBackground) {
            ImageVector.Builder(
                name = "NoInternetIc",
                defaultWidth = 800.dp,
                defaultHeight = 800.dp,
                viewportWidth = 55.314f,
                viewportHeight = 55.314f
            ).apply {
                path(fill = SolidColor(onBackground)) {
                    moveTo(12.551f, 46.824f)
                    curveToRelative(1.864f, 0f, 3.658f, -0.4f, 5.334f, -1.188f)
                    curveToRelative(2.188f, -1.029f, 5.165f, -1.264f, 7.4f, -0.558f)
                    curveToRelative(2.811f, 0.889f, 5.832f, 1.104f, 8.775f, 0.589f)
                    curveToRelative(1.104f, -0.192f, 3.261f, 0.071f, 5.054f, 0.616f)
                    curveToRelative(1.18f, 0.359f, 2.408f, 0.541f, 3.651f, 0.541f)
                    curveToRelative(6.92f, 0f, 12.549f, -5.629f, 12.549f, -12.548f)
                    curveToRelative(0f, -2.296f, -0.626f, -4.541f, -1.812f, -6.493f)
                    curveToRelative(-0.336f, -0.553f, -0.73f, -1.259f, -1.184f, -2.067f)
                    curveToRelative(-1.903f, -3.396f, -4.78f, -8.529f, -8.576f, -12.118f)
                    curveToRelative(-3.483f, -3.294f, -8.043f, -5.108f, -12.838f, -5.108f)
                    curveToRelative(-4.334f, 0f, -8.558f, 1.517f, -11.896f, 4.272f)
                    curveToRelative(-3.717f, 3.069f, -5.515f, 6.909f, -6.379f, 8.754f)
                    curveToRelative(-0.031f, 0.068f, -0.066f, 0.14f, -0.099f, 0.211f)
                    curveTo(5.619f, 21.737f, 0f, 27.362f, 0f, 34.275f)
                    curveTo(0.002f, 41.195f, 5.631f, 46.824f, 12.551f, 46.824f)
                    close()
                    moveTo(12.551f, 24.728f)
                    curveToRelative(0.226f, 0f, 0.448f, 0.011f, 0.666f, 0.029f)
                    lineToRelative(0.068f, 0.006f)
                    horizontalLineToRelative(0.063f)
                    curveToRelative(1.076f, -0.001f, 1.463f, -0.829f, 1.999f, -1.974f)
                    curveToRelative(0.83f, -1.773f, 2.376f, -5.074f, 5.572f, -7.713f)
                    curveToRelative(2.801f, -2.312f, 6.347f, -3.585f, 9.985f, -3.585f)
                    curveToRelative(4.025f, 0f, 7.852f, 1.523f, 10.777f, 4.288f)
                    curveToRelative(3.463f, 3.274f, 6.205f, 8.167f, 8.02f, 11.405f)
                    curveToRelative(0.473f, 0.843f, 0.886f, 1.579f, 1.236f, 2.157f)
                    curveToRelative(0.9f, 1.483f, 1.376f, 3.19f, 1.376f, 4.937f)
                    curveToRelative(0f, 5.265f, -4.283f, 9.548f, -9.549f, 9.548f)
                    curveToRelative(-0.947f, 0f, -1.882f, -0.138f, -2.778f, -0.411f)
                    curveToRelative(-1.672f, -0.508f, -3.55f, -0.812f, -5.023f, -0.812f)
                    curveToRelative(-0.519f, 0f, -0.997f, 0.037f, -1.42f, 0.111f)
                    curveToRelative(-2.473f, 0.431f, -5.001f, 0.249f, -7.355f, -0.495f)
                    curveToRelative(-2.945f, -0.932f, -6.729f, -0.639f, -9.582f, 0.704f)
                    curveToRelative(-1.272f, 0.599f, -2.638f, 0.903f, -4.057f, 0.903f)
                    curveTo(7.283f, 43.826f, 3f, 39.543f, 3f, 34.278f)
                    curveTo(3.002f, 29.012f, 7.285f, 24.728f, 12.551f, 24.728f)
                    close()
                }
            }.build()
        }

        return _NoInternetIc!!
    }

@Suppress("ObjectPropertyName")
private var _NoInternetIc: ImageVector? = null


@Preview
@Composable
private fun ShowImg() {
    AppTheme {
        Image(
            imageVector = NoInternetIc,
            contentDescription = null,
        )
    }
}