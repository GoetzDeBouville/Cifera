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

val ServerErrorIc: ImageVector
    @Composable
    get() {

        val onBackground = MaterialTheme.colorScheme.onBackground

        _ServerErrorIc = remember(onBackground) {
            ImageVector.Builder(
                name = "ServerErrorIc",
                defaultWidth = 800.dp,
                defaultHeight = 800.dp,
                viewportWidth = 48f,
                viewportHeight = 48f
            ).apply {
                path(fill = SolidColor(onBackground)) {
                    moveTo(46f, 31.1f)
                    curveToRelative(-0.2f, 4.8f, -3.8f, 9.9f, -11.5f, 9.9f)
                    horizontalLineTo(34f)
                    arcToRelative(
                        1.7f,
                        1.7f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        -1.4f,
                        -0.6f
                    )
                    arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 39f)
                    arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2f)
                    horizontalLineToRelative(0.5f)
                    curveToRelative(7.1f, 0f, 7.5f, -5.4f, 7.5f, -6f)
                    arcToRelative(
                        6.2f,
                        6.2f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        -4.1f,
                        -6f
                    )
                    horizontalLineToRelative(-0.2f)
                    arcToRelative(
                        1.7f,
                        1.7f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        -1.2f,
                        -1.7f
                    )
                    verticalLineToRelative(-0.4f)
                    arcToRelative(
                        6f,
                        6f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        -1.8f,
                        -4.4f
                    )
                    arcTo(6.4f, 6.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 29f, 17.1f)
                    horizontalLineToRelative(-0.5f)
                    arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 26.7f, 16f)
                    arcToRelative(
                        8.8f,
                        8.8f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        -2.8f,
                        -3.4f
                    )
                    arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.5f, 11f)
                    arcToRelative(
                        7.7f,
                        7.7f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        -5.9f,
                        2.6f
                    )
                    arcToRelative(
                        9.1f,
                        9.1f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        -2.2f,
                        6.6f
                    )
                    horizontalLineToRelative(0f)
                    arcToRelative(
                        1.8f,
                        1.8f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        -1.1f,
                        1.9f
                    )
                    arcToRelative(
                        8.1f,
                        8.1f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        -2.7f,
                        2.5f
                    )
                    arcToRelative(
                        7.3f,
                        7.3f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        -1.5f,
                        3.5f
                    )
                    arcToRelative(
                        7.6f,
                        7.6f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        2f,
                        6.7f
                    )
                    arcTo(7.9f, 7.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 37f)
                    horizontalLineToRelative(2f)
                    arcToRelative(
                        2.1f,
                        2.1f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        2f,
                        2f
                    )
                    arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                    horizontalLineTo(14f)
                    arcToRelative(
                        12.4f,
                        12.4f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        -8.7f,
                        -3.2f
                    )
                    arcTo(
                        11.5f,
                        11.5f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        2.2f,
                        27.6f
                    )
                    arcToRelative(
                        11.8f,
                        11.8f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        5.2f,
                        -8.2f
                    )
                    arcTo(
                        12.4f,
                        12.4f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        10.6f,
                        11f
                    )
                    arcToRelative(
                        11.6f,
                        11.6f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        8.9f,
                        -4f
                    )
                    arcToRelative(
                        12.2f,
                        12.2f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        10.1f,
                        6f
                    )
                    arcToRelative(
                        9.8f,
                        9.8f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        7.5f,
                        2.3f
                    )
                    arcToRelative(
                        9.1f,
                        9.1f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        3.4f,
                        6.5f
                    )
                    arcTo(9.9f, 9.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 46f, 31.1f)
                    close()
                }
                path(fill = SolidColor(onBackground)) {
                    moveTo(26.8f, 28f)
                    lineToRelative(3.6f, -3.6f)
                    arcToRelative(
                        2f,
                        2f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        -2.8f,
                        -2.8f
                    )
                    lineTo(24f, 25.2f)
                    lineToRelative(-3.6f, -3.6f)
                    arcToRelative(
                        2f,
                        2f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        -2.8f,
                        2.8f
                    )
                    lineTo(21.2f, 28f)
                    lineToRelative(-3.6f, 3.6f)
                    arcToRelative(
                        1.9f,
                        1.9f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        0f,
                        2.8f
                    )
                    arcToRelative(
                        1.9f,
                        1.9f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        2.8f,
                        0f
                    )
                    lineTo(24f, 30.8f)
                    lineToRelative(3.6f, 3.6f)
                    arcToRelative(
                        1.9f,
                        1.9f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        2.8f,
                        0f
                    )
                    arcToRelative(
                        1.9f,
                        1.9f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        0f,
                        -2.8f
                    )
                    close()
                }
            }.build()
        }

        return _ServerErrorIc!!
    }

@Suppress("ObjectPropertyName")
private var _ServerErrorIc: ImageVector? = null


@Preview
@Composable
private fun ShowImg() {
    AppTheme {
        Image(
            imageVector = ServerErrorIc,
            contentDescription = null,
        )
    }
}