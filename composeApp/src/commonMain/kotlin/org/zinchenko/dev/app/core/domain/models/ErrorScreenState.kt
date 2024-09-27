package org.zinchenko.dev.app.core.domain.models

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import ciphera.composeapp.generated.resources.Res
import ciphera.composeapp.generated.resources.no_internet_connection
import ciphera.composeapp.generated.resources.nothing_found
import ciphera.composeapp.generated.resources.something_went_wrong
import org.jetbrains.compose.resources.StringResource
import org.zinchenko.dev.app.uikit.imgresources.EmptyIc
import org.zinchenko.dev.app.uikit.imgresources.NoInternetIc
import org.zinchenko.dev.app.uikit.imgresources.ServerErrorIc

enum class ErrorScreenState(
    val errorImg: @Composable () -> ImageVector,
    val errorDescriptionResId: StringResource
) {
    NO_INTERNET(
        { NoInternetIc },
        Res.string.no_internet_connection
    ),
    SERVER_ERROR(
        { ServerErrorIc },
        Res.string.something_went_wrong
    ),
    NOTHING_FOUND(
        { EmptyIc },
        Res.string.nothing_found
    )
}