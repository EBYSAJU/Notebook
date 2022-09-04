package com.example.notebook.note_app.domain.usecase

import com.example.notebook.note_app.domain.model.Note
import com.example.notebook.note_app.domain.repository.NoteRepository

class DeleteNodeUseCase(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(note: Note){
        repository.deleteNode(note)
    }

}