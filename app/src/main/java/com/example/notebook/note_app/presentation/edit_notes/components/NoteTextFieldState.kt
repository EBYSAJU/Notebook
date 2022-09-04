package com.example.notebook.note_app.presentation.edit_notes.components

data class NoteTextFieldState(
    val text: String = "",
    val hint: String = "",
    val isHintVisible: Boolean = true
)
