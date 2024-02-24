package com.example.accountnotes.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Journal (
    @PrimaryKey
    val id: Int? = null,
    val name: String
)