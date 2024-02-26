package com.example.roomdbexample.Repository

import androidx.annotation.WorkerThread
import com.example.roomdbexample.Model.Note
import com.example.roomdbexample.Room.NoteTakeDAO
import kotlinx.coroutines.flow.Flow

class NoteRepository(private val noteDao : NoteTakeDAO) {
    val myAllNotes : Flow<List<Note>> = noteDao.getAllNotes()

    @WorkerThread
    suspend fun insert(note: Note){
        noteDao.insert(note)
    }

    @WorkerThread
    suspend fun update(note: Note){
        noteDao.update(note)
    }

    @WorkerThread
    suspend fun delete(note: Note){
        noteDao.delete(note)
    }

    @WorkerThread
    suspend fun deleteAllNotes(){
        noteDao.deleteAllNotes()
    }
}