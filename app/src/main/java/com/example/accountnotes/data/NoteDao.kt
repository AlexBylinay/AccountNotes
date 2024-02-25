package com.example.accountnotes.data

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

interface NoteDao {
    @Insert
    suspend fun insertItem(item: NoteDb)
    @Delete
    suspend fun deleteItem(item: NoteDb)
    @Query( "SELECT * FROM notes WHERE journalName = :journalName" )
    suspend fun getAllItems (journalName: String): Flow<List<NoteDao>>
}