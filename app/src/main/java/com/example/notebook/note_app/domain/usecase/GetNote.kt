package com.example.notebook.note_app.domain.usecase

import com.example.notebook.note_app.domain.model.Note
import com.example.notebook.note_app.domain.repository.NoteRepository

class GetNote(private  val repository:NoteRepository
) {
    suspend operator  fun invoke(id:Int): Note?{
        return repository.getNoteById(id)
    }
}