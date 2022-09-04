package com.example.notebook.note_app.domain.usecase

data  class NoteUseCases(
    val getNotes:GetNotesUseCase,
    val deleteNode:DeleteNodeUseCase,
    val addNote:AddNote,
    val getNote:GetNote

)
