package com.example.accountnotes.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
@Database(
    entities = [Journal::class,
        Note::class], version = 1)

abstract class DataBase: RoomDatabase() {
    abstract val Journaldao: JournalDao
    abstract val Notedao: NoteDao
    companion object{
        fun createDataBase(context: Context): DataBase{
            return Room.databaseBuilder(
                context,
                DataBase::class.java,
                "test.db"
            ).build()
        }
    }
}
