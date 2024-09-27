package org.zinchenko.dev.app.features.chatlist.presenation.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.zinchenko.dev.app.core.domain.models.Chat
import org.zinchenko.dev.app.features.chatlist.presenation.store.ChatListStore
import org.zinchenko.dev.app.uikit.ChatItem
import org.zinchenko.dev.app.uikit.ErrorScreen
import org.zinchenko.dev.app.uikit.Loading

@Composable
fun ChatListScreen(

) {
}

@Composable
private fun Content(
    state: ChatListStore.State,
    accept: (ChatListStore.Intent) -> Unit
) {
    Scaffold(
        modifier = Modifier
            .background(color = MaterialTheme.colorScheme.background)
            .fillMaxSize()
            .padding(top = 16.dp)
            .windowInsetsPadding(WindowInsets.safeDrawing)
    ) {
        Column(modifier = Modifier.padding(horizontal = 16.dp)) {

            Spacer(
                modifier = Modifier.height(16.dp)
            )

            if (state.isLoading) {
                Loading()
            } else if (state.errorType != null) {
                ErrorScreen(state.errorType)
            } else {
                ChatList(state.chatList)
            }
            Spacer(
                modifier = Modifier.weight(1f)
            )
        }
    }
}


@Composable
private fun ChatList(
    // navigation controller
    chatList: List<Chat>
) {
    LazyColumn {
        items(chatList) { chat ->
            ChatItem(chat = chat)
        }
    }
}

@Composable
@Preview
fun ChatListScreenPreview() {
    Content(
        ChatListStore.State(
            isLoading = true
        ), accept = {}
    )
}