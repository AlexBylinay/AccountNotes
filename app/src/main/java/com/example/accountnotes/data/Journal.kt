package com.example.accountnotes.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "journals")
data class Journal (
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val name: String
)