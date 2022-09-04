package com.example.notebook.note_app.presentation.notes

import com.example.notebook.note_app.domain.model.Note
import com.example.notebook.note_app.domain.util.NoteOrder

sealed class NotesEvent{
    data class  Order(val noteOrder: NoteOrder):NotesEvent()
    data class DeleteNote(val note: Note):NotesEvent()
    object RestoreNote:NotesEvent()
    object ToggleOrderSection:NotesEvent()
}
