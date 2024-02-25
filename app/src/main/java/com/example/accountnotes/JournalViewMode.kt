package com.example.accountnotes

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.CreationExtras
import com.example.accountnotes.data.DataBase
import com.example.accountnotes.data.Journal
import kotlinx.coroutines.launch

class JournalViewMode(private val database: DataBase) : ViewModel() {

    val itemsList = database.Journaldao.getAllItems()
    val newText = mutableStateOf("")
    private var journal: Journal? = null


    fun insertItem() = viewModelScope.launch {
        val nameItem = journal?.copy(name = newText.value)
            ?: Journal(name = newText.value)
        database.Journaldao.insertItem(nameItem)

        journal = null
        newText.value = ""
    }

    suspend fun insertItem2(journal1: Journal){
        database.Journaldao.insertItem(journal1)
    }

    fun deleteItem(item: Journal) = viewModelScope.launch {
        database.Journaldao.deleteItem(item)
    }

    suspend fun getAll() {
        database.Journaldao.getAllItems()
    }

    companion object {
        val factory: ViewModelProvider.Factory = object : ViewModelProvider.Factory{
            override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T {
                val db = (checkNotNull(extras[APPLICATION_KEY]) as App).database
                return JournalViewMode(db) as T
            }
        }        }




}


