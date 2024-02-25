package com.example.accountnotes.data

import androidx.room.Entity

@Entity(tableName = "notes")
data class NoteDb (
    val id: Int? = null,
   // val note: Note,
    val note: Temperary,
    val journalName: String
)
