package com.example.notebook.note_app.domain.util

sealed class OrderType{
    object Ascending:OrderType()
    object Descending:OrderType()
}


