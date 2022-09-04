package com.example.notebook.note_app.di

import android.app.Application
import androidx.room.Database
import androidx.room.Room
import com.example.notebook.note_app.data.data_source.NoteDatabase
import com.example.notebook.note_app.domain.repository.NoteRepository
import com.example.notebook.note_app.domain.repository.NoteRepositoryImplementation
import com.example.notebook.note_app.domain.usecase.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideNoteDatabase(app:Application):NoteDatabase{
        return  Room.databaseBuilder(
            app,
            NoteDatabase::class.java,
            NoteDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db:NoteDatabase):NoteRepository{
        return  NoteRepositoryImplementation(db.noteDao)
    }
    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NoteRepository):NoteUseCases{
        return NoteUseCases(
            getNotes = GetNotesUseCase(repository),
            deleteNode= DeleteNodeUseCase(repository),
            addNote = AddNote(repository),
            getNote= GetNote(repository)

        )
    }




}