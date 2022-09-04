package com.example.notebook.note_app.presentation.notes.components

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.notebook.note_app.domain.util.NoteOrder
import com.example.notebook.note_app.domain.util.OrderType

@Composable
fun OrderSection(
    modifier: Modifier,
    noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    onOrderChange: (NoteOrder) -> Unit
) {
    Column(
        modifier = Modifier
    ) {
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            DefaultRadioButton(text = "Title",
                selected = noteOrder is NoteOrder.Title,
                onSelect = {
                    onOrderChange(NoteOrder.Title(noteOrder.orderType))

                }

            )


            Spacer(modifier = Modifier.width(8.dp))
            DefaultRadioButton(text = "Date",
                selected = noteOrder is NoteOrder.Title,
                onSelect = {
                    onOrderChange(NoteOrder.Title(noteOrder.orderType))

                }

            )
            Spacer(modifier = Modifier.width(8.dp))
            DefaultRadioButton(text = "Color",
                selected = noteOrder is NoteOrder.Title,
                onSelect = {
                    onOrderChange(NoteOrder.Title(noteOrder.orderType))

                }

            )

        }
        Spacer(modifier=Modifier.height(16.dp))
        Row(
            modifier=Modifier.fillMaxWidth()
        ){
            DefaultRadioButton(text = "Ascending",
                selected = noteOrder.orderType is OrderType.Ascending,
                onSelect = {
                    onOrderChange(noteOrder.copy(OrderType.Ascending))

                }

            )


            Spacer(modifier = Modifier.width(8.dp))
            DefaultRadioButton(text = "Descending",
                selected = noteOrder.orderType is OrderType.Descending,
                onSelect = {
                    onOrderChange(noteOrder.copy(OrderType.Descending))

                }

            )
        }

    }
}
