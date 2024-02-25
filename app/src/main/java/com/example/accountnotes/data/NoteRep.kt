package com.example.accountnotes.data

import kotlinx.coroutines.flow.Flow

interface NoteRep {
    suspend fun insertItem(item: NoteDb)
    suspend fun deleteItem(item: NoteDb)
    suspend fun getAllItems (journalName: String): Flow<List<NoteDao>>
}