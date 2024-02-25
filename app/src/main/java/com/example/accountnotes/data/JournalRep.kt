package com.example.accountnotes.data

import kotlinx.coroutines.flow.Flow

interface JournalRep {

    suspend fun insertItem(item: Journal)

    suspend fun deleteItem(item: Journal)

    suspend fun getAllItems (): Flow<List<Journal>>
}