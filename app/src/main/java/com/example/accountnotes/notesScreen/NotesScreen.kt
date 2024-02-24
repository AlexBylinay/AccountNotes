package com.example.accountnotes.notesScreen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun NotesScreen(name:String) {

    name?.let {
        Text(
            text = name,
            modifier = Modifier
                .fillMaxSize()
                .wrapContentWidth()
                .wrapContentHeight()
        )
    }
}