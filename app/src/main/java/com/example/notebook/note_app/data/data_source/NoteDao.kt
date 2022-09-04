package com.example.notebook.note_app.data.data_source

import androidx.room.*
import com.example.notebook.note_app.domain.model.Note
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {
    @Query("select * from note")
fun  getNotes():Flow<List<Note>>
@Query("select * from note where id=:id")
suspend fun getNoteById(id:Int):Note?
@Insert(onConflict = OnConflictStrategy.REPLACE)
suspend fun insertNote(note:Note)
@Delete
suspend fun deleteNode(note: Note)

}