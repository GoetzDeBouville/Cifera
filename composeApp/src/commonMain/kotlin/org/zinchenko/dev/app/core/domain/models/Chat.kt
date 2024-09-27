package org.zinchenko.dev.app.core.domain.models

import androidx.compose.ui.graphics.Color
import kotlinx.datetime.Instant

data class Chat(
    val id: Int,
    val color: Color,
    val userNames: List<String>,
    val dateLastUpdate: Instant,
    val dateCreate: Instant
)