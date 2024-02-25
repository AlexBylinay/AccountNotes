package com.example.accountnotes.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow


@Dao
interface JournalDao {
    @Insert
    suspend fun insertItem(item: Journal)
    @Delete
    suspend fun deleteItem(item: Journal)
    @Query ( "SELECT * FROM journals" )
    fun getAllItems(): Flow<List<Journal>>






}