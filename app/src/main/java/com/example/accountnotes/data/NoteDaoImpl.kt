package com.example.accountnotes.data

import kotlinx.coroutines.flow.Flow

class NoteDaoImpl (private val dao: NoteDao): NoteRep {
    override suspend fun insertItem(item: NoteDb) {
   dao.insertItem(item)
    }

    override suspend fun deleteItem(item: NoteDb) {
    dao.deleteItem(item)
    }
    override suspend fun getAllItems(journalName: String): Flow<List<NoteDao>> {
       return dao.getAllItems(journalName)
    }

}