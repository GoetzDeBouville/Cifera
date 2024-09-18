package org.zinchenko.dev.app.features.main

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.aakira.napier.Napier
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.zinchenko.dev.app.utils.isDesktop

@Composable
fun MainScreen() {
    Box(
        modifier = Modifier.fillMaxSize()
            .windowInsetsPadding(WindowInsets.safeDrawing)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            Text(text = "Ciphera")

            if (isDesktop()) {
                Button(
                    modifier = Modifier.padding(16.dp),
                    onClick = {
                        Napier.v(message = "Button Create server clicked", tag = "MainScreen")
                    }
                ) {
                    Text(text = "Create server")
                }
            }

            Button(
                modifier = Modifier.padding(16.dp),
                onClick = {
                    Napier.v(message = "Button Chat list clicked", tag = "MainScreen")
                }
            ) {
                Text(text = "Chat list")
            }

            Button(
                modifier = Modifier.padding(16.dp),
                onClick = {
                    Napier.v(message = "Button Connect to chat clicked", tag = "MainScreen")
                }
            ) {
                Text(text = "Connect to chat")
            }
        }
    }
}

@Composable
@Preview
fun MainScreenPreview() {
    MainScreen()
}