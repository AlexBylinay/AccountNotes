package com.example.accountnotes.create_screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun CreateScreen() {
        Text(
            text = "Create",
            modifier = Modifier.fillMaxSize()
                .wrapContentWidth()
                .wrapContentHeight()
        )
}
