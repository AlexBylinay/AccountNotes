package com.example.accountnotes.data

import kotlinx.coroutines.flow.Flow

class JournalRepImpl (private val dao: JournalDao):JournalRep {
    override suspend fun insertItem(item: Journal) {
        dao.insertItem(item)
    }
    override suspend fun deleteItem(item: Journal) {
dao.deleteItem(item)
    }
    override suspend fun getAllItems(): Flow<List<Journal>> {
       return dao.getAllItems()

    }


}