package com.example.accountnotes.create_screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.accountnotes.JournalViewMode
import com.example.accountnotes.data.Journal

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CreateScreen(
   )

 {

    var inputFieldText by remember { mutableStateOf("rr") }
    var vm: JournalViewMode

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(top = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = {
         val  journal = Journal(null,inputFieldText )
            gh(journal)

        })
        {
            Text("create")
        }

        OutlinedTextField(
            value = inputFieldText,
            onValueChange = {
                inputFieldText = it
            },
            label = {
                Text("Label")
            }
        )

    }




    Text(
        text = "Create",
        modifier = Modifier.fillMaxSize()
            .wrapContentWidth()
            .wrapContentHeight()
    )
     suspend fun gh(j:Journal){
         vm.insertItem2(j)
     }
}
