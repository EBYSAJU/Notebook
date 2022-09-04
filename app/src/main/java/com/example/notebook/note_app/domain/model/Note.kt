package com.example.notebook.note_app.domain.model

import androidx.compose.ui.graphics.Color
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.plcoding.cleanarchitecturenoteapp.ui.theme.*

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null


){
    companion object{
        val noteColors= listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink, Color.White,Green)
    }

}
class InvalidNoteException(message:String):Exception(message)
