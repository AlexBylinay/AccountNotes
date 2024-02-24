package com.example.accountnotes.data

import androidx.room.Database
import androidx.room.RoomDatabase
@Database(
    entities = [Journal::class,
        Note::class], version = 1)

abstract class DataBase: RoomDatabase() {
}
