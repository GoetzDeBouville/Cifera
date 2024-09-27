package org.zinchenko.dev.app.features.chatlist.presenation.store

import com.arkivanov.mvikotlin.core.store.Store
import org.zinchenko.dev.app.core.domain.models.Chat
import org.zinchenko.dev.app.core.domain.models.ErrorScreenState
import org.zinchenko.dev.app.features.chatlist.presenation.store.ChatListStore.Intent
import org.zinchenko.dev.app.features.chatlist.presenation.store.ChatListStore.Label
import org.zinchenko.dev.app.features.chatlist.presenation.store.ChatListStore.State

internal interface ChatListStore : Store<Intent, State, Nothing> {

    sealed interface Intent {
    }

    data class State(
        val chatList: List<Chat> = emptyList(),
        val isLoading: Boolean = false,
        val errorType: ErrorScreenState? = null
    )

    sealed interface Label {
    }
}
