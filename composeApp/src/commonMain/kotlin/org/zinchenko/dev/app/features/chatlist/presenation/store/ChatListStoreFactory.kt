package org.zinchenko.dev.app.features.chatlist.presenation.store

import com.arkivanov.mvikotlin.core.store.Reducer
import com.arkivanov.mvikotlin.core.store.Store
import com.arkivanov.mvikotlin.core.store.StoreFactory
import com.arkivanov.mvikotlin.extensions.coroutines.CoroutineBootstrapper
import com.arkivanov.mvikotlin.extensions.coroutines.CoroutineExecutor
import org.zinchenko.dev.app.core.domain.models.Chat
import org.zinchenko.dev.app.core.domain.models.ErrorType
import org.zinchenko.dev.app.features.chatlist.presenation.store.ChatListStore.Intent
import org.zinchenko.dev.app.features.chatlist.presenation.store.ChatListStore.State


internal class ChatListStoreFactory(
    private val storeFactory: StoreFactory
) {

    fun create(): ChatListStore =
        object : ChatListStore, Store<Intent, State, Nothing> by storeFactory.create(
            name = "ChatListStore",
            initialState = State(),
            bootstrapper = BootstrapperImpl(),
            executorFactory = ::ExecutorImpl,
            reducer = ReducerImpl
        ) {}


    private sealed interface Msg {
        data class Loading(val isLoading: Boolean) : Msg
        data class ChatsLoaded(val cities: List<Chat>) : Msg
        data class LoadError(val error: ErrorType) : Msg
        data object Empty : Msg
    }

    private sealed interface Action {
        data class Loading(val isLoading: Boolean) : Action
        data class CitiesLoaded(val cities: List<Chat>) : Action
        data class LoadError(val error: ErrorType) : Action
        data object Empty : Action
    }

    private class BootstrapperImpl : CoroutineBootstrapper<Action>() {
        override fun invoke() {
        }
    }

    private class ExecutorImpl : CoroutineExecutor<Intent, Action, State, Msg, Nothing>() {

    }

    private object ReducerImpl : Reducer<State, Msg> {
        override fun State.reduce(message: Msg): State =
//            when (message) {
//            }
            State()
    }
}
