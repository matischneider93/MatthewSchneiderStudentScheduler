package com.example.matthewschneiderstudentscheduler.databases;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.matthewschneiderstudentscheduler.models.Note;

import java.util.List;

@Dao
public interface NoteDao {
    @Query("SELECT * FROM note_table ORDER BY noteId")
    List<Note> getNoteList();

    @Query("SELECT * FROM note_table WHERE noteId = :noteId ORDER BY noteId")
    Note getNote(int noteId);

    @Query("SELECT * FROM note_table")
    List<Note> getAllNotes();

    @Query("SELECT * FROM note_table WHERE course_id_fk = :courseId ORDER BY noteId")
    List<Note> getNotesByCourse(int courseId);


    @Insert
    void insertNote(Note note);

    @Insert
    void insertAll(Note... note);

    @Update
    void updateNote(Note note);

    @Delete
    void deleteNote(Note note);

    @Query("DELETE FROM note_table")
    void deleteAllNotes();
}
