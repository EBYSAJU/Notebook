package com.example.notebook.note_app.domain.repository

import com.example.notebook.note_app.data.data_source.NoteDao
import com.example.notebook.note_app.domain.model.Note
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImplementation(
    private val dao:NoteDao
):NoteRepository {
    override fun getNotes(): Flow<List<Note>> {
        return dao.getNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return dao.getNoteById(id)
    }

    override suspend fun insertNote(note: Note) {
        dao.insertNote(note)
    }

    override suspend fun deleteNode(note: Note) {
     dao.deleteNode(note)
    }
}