package com.example.notebook.note_app.domain.usecase

import com.example.notebook.note_app.domain.model.InvalidNoteException
import com.example.notebook.note_app.domain.model.Note
import com.example.notebook.note_app.domain.repository.NoteRepository
import kotlin.jvm.Throws

class AddNote(
    private val repository: NoteRepository
) {
    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note){
        if(note.title.isBlank()){
        throw InvalidNoteException("The title of the note can't be empty.")
        }
        if (note.content.isBlank()){
            throw InvalidNoteException("The content of the node can be empty")
        }
        repository.insertNote(note)
    }

}