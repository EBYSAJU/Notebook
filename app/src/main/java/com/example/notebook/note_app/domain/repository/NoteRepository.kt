package com.example.notebook.note_app.domain.repository

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.notebook.note_app.domain.model.Note
import kotlinx.coroutines.flow.Flow

interface NoteRepository {

    fun  getNotes(): Flow<List<Note>>

    suspend fun getNoteById(id:Int): Note?

    suspend fun insertNote(note: Note)

    suspend fun deleteNode(note: Note)
}