package com.example.notebook.note_app.domain.usecase

import com.example.notebook.note_app.domain.model.Note
import com.example.notebook.note_app.domain.repository.NoteRepository
import com.example.notebook.note_app.domain.util.NoteOrder
import com.example.notebook.note_app.domain.util.OrderType
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GetNotesUseCase(
    private val repository:NoteRepository
) {
operator fun invoke(
    noteOrder: NoteOrder=NoteOrder.Date(OrderType.Descending)
):Flow<List<Note>>{
return repository.getNotes().map { notes->
    when(noteOrder.orderType){
        is OrderType.Ascending->{
            when(noteOrder){
                is NoteOrder.Title->notes.sortedBy { it.title.lowercase() }
                is NoteOrder.Date->notes.sortedBy { it.timestamp }
                is NoteOrder.Color->notes.sortedBy { it.color }
            }


        }
        is OrderType.Descending->{
            when(noteOrder){
                is NoteOrder.Title->notes.sortedByDescending { it.title.lowercase() }
                is NoteOrder.Date->notes.sortedByDescending { it.timestamp }
                is NoteOrder.Color->notes.sortedByDescending { it.color }
            }
        }

    }

}
}

}