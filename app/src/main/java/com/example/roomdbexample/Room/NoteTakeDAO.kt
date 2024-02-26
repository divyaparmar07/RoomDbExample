package com.example.roomdbexample.Room

import androidx.room.*
import com.example.roomdbexample.Model.Note
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteTakeDAO {

    @Insert
    suspend fun insert(note : Note)

    @Update
    suspend fun update(note : Note)

    @Delete
    suspend fun delete(note : Note)

    @Query("DELETE FROM note_table")
    suspend fun deleteAllNotes()

    @Query("SELECT * FROM note_table ORDER BY id ASC")
    fun getAllNotes() : Flow<List<Note>>

}