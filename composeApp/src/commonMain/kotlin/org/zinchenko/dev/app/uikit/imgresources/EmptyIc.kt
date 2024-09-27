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

val EmptyIc: ImageVector
    @Composable
    get() {

        val onBackground = MaterialTheme.colorScheme.onBackground

        _EmptyIc = remember(onBackground) {
            ImageVector.Builder(
                name = "EmptyFolderSvgrepoCom 1",
                defaultWidth = 800.dp,
                defaultHeight = 800.dp,
                viewportWidth = 56.724f,
                viewportHeight = 56.724f
            ).apply {
                path(fill = SolidColor(onBackground)) {
                    moveTo(7.487f, 46.862f)
                    curveToRelative(1.111f, 1.467f, 2.865f, 2.275f, 4.938f, 2.275f)
                    horizontalLineToRelative(30.598f)
                    curveToRelative(3.984f, 0f, 7.934f, -3.009f, 8.991f, -6.849f)
                    lineToRelative(4.446f, -16.136f)
                    curveToRelative(0.55f, -1.997f, 0.237f, -3.904f, -0.88f, -5.371f)
                    curveToRelative(-1.118f, -1.467f, -2.873f, -2.274f, -4.945f, -2.274f)
                    horizontalLineToRelative(-3.044f)
                    lineToRelative(-0.667f, -2.65f)
                    curveToRelative(-0.692f, -2.759f, -4.368f, -4.919f, -8.367f, -4.919f)
                    horizontalLineToRelative(-11.24f)
                    curveToRelative(-2.932f, 0f, -4.935f, -0.6f, -5.413f, -0.94f)
                    curveToRelative(-1.259f, -2.292f, -6.867f, -2.41f, -8f, -2.41f)
                    horizontalLineToRelative(-7.27f)
                    curveToRelative(-2.036f, 0f, -3.845f, 0.798f, -5.093f, 2.249f)
                    curveToRelative(-1.248f, 1.45f, -1.769f, 3.356f, -1.448f, 5.467f)
                    lineToRelative(6.338f, 29.047f)
                    curveTo(6.572f, 45.268f, 6.926f, 46.122f, 7.487f, 46.862f)
                    close()
                    moveTo(53.193f, 22.599f)
                    curveToRelative(0.537f, 0.705f, 0.669f, 1.684f, 0.374f, 2.756f)
                    lineToRelative(-4.445f, 16.137f)
                    curveToRelative(-0.693f, 2.518f, -3.486f, 4.646f, -6.099f, 4.646f)
                    horizontalLineTo(12.425f)
                    curveToRelative(-1.112f, 0f, -2.016f, -0.386f, -2.547f, -1.086f)
                    curveToRelative(-0.531f, -0.701f, -0.657f, -1.676f, -0.356f, -2.746f)
                    lineToRelative(3.057f, -10.858f)
                    curveToRelative(0.709f, -2.518f, 3.518f, -4.646f, 6.133f, -4.646f)
                    horizontalLineToRelative(9.751f)
                    curveToRelative(3.51f, 0f, 7.461f, -1.271f, 8.219f, -3.695f)
                    curveToRelative(0.196f, -0.479f, 2.256f, -1.6f, 5.359f, -1.6f)
                    horizontalLineToRelative(8.593f)
                    curveTo(51.749f, 21.507f, 52.657f, 21.895f, 53.193f, 22.599f)
                    close()
                    moveTo(3.815f, 11.792f)
                    curveToRelative(0.669f, -0.777f, 1.671f, -1.206f, 2.82f, -1.206f)
                    horizontalLineToRelative(7.27f)
                    curveToRelative(2.932f, 0f, 4.935f, 0.6f, 5.413f, 0.941f)
                    curveToRelative(1.26f, 2.292f, 6.866f, 2.41f, 7.999f, 2.41f)
                    horizontalLineToRelative(11.241f)
                    curveToRelative(2.743f, 0f, 5.144f, 1.399f, 5.458f, 2.65f)
                    lineToRelative(0.482f, 1.919f)
                    horizontalLineToRelative(-2.456f)
                    curveToRelative(-3.511f, 0f, -7.461f, 1.271f, -8.219f, 3.695f)
                    curveToRelative(-0.197f, 0.479f, -2.257f, 1.6f, -5.359f, 1.6f)
                    horizontalLineToRelative(-9.751f)
                    curveToRelative(-3.979f, 0f, -7.942f, 3.001f, -9.021f, 6.832f)
                    lineToRelative(-1.793f, 6.371f)
                    lineTo(3.042f, 14.758f)
                    curveTo(2.871f, 13.623f, 3.146f, 12.569f, 3.815f, 11.792f)
                    close()
                }
            }.build()
        }

        return _EmptyIc!!
    }

@Suppress("ObjectPropertyName")
private var _EmptyIc: ImageVector? = null


@Preview
@Composable
private fun ShowImg() {
    AppTheme {
        Image(
            imageVector = EmptyIc,
            contentDescription = null,
        )
    }
}