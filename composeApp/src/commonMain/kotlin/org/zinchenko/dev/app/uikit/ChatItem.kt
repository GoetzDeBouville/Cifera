package org.zinchenko.dev.app.uikit

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlinx.datetime.Clock
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.zinchenko.dev.app.core.domain.models.Chat
import org.zinchenko.dev.app.utils.extensions.formatInstantToDateString

@Composable
fun ChatItem(
    modifier: Modifier = Modifier,
    chat: Chat
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp, horizontal = 8.dp)
            .clickable {
                // add navigation
            },
        colors = CardColors(
            containerColor = Color.Transparent,
            contentColor = Color.Unspecified,
            disabledContainerColor = Color.Unspecified,
            disabledContentColor = Color.Unspecified
        )
    ) {
        Column(
            modifier = Modifier.padding(vertical = 8.dp)
        ) {
            Text(text = chat.userNames.toString(),
                style = MaterialTheme.typography.titleMedium.copy(
                    color = MaterialTheme.colorScheme.primary
                ))
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = chat.dateCreate.formatInstantToDateString(),
                style = MaterialTheme.typography.titleSmall.copy(
                    color = MaterialTheme.colorScheme.onBackground
                )
            )
            Spacer(modifier = Modifier.height(8.dp))
            HorizontalDivider(
                color = MaterialTheme.colorScheme.primary,
                thickness = 1.dp,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}


@Preview
@Composable
fun DemoScreenPreview() {
    ChatItem(chat = chatXmpl)
}

val chatXmpl = Chat(
    id = 2824,
    color = Color.Green,
    userNames = listOf("Alex", "Bob", "John", "Mike"),
    dateLastUpdate = Clock.System.now(),
    dateCreate = Clock.System.now()
)