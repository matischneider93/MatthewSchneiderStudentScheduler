package com.example.matthewschneiderstudentscheduler.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import static androidx.room.ForeignKey.CASCADE;

@Entity(tableName = "note_table",
        foreignKeys = @ForeignKey(entity = Course.class, parentColumns = "courseId", childColumns = "course_id_fk",
                onDelete = CASCADE))
public class Note {
    @PrimaryKey(autoGenerate = true)
    private int noteId;
    @ColumnInfo(name = "course_id_fk")
    private int course_id_fk;
    @ColumnInfo(name = "noteTitle")
    private String noteTitle;
    @ColumnInfo(name = "noteText")
    private String noteText;

    // Empty Constructor
    public Note() {
    }

    // Constructor
    public Note(int noteId, int course_id_fk, String noteTitle, String noteText) {
        this.noteId = noteId;
        this.course_id_fk = course_id_fk;
        this.noteTitle = noteTitle;
        this.noteText = noteText;
    }

    // Getters
    public int getNoteId() {
        return noteId;
    }

    public int getCourse_id_fk() {
        return course_id_fk;
    }

    public String getNoteTitle() {
        return noteTitle;
    }

    public String getNoteText() {
        return noteText;
    }

    public String getNote_text() {
        return noteText;
    }

    // Setters
    public void setNoteId(int noteId) {
        this.noteId = noteId;
    }

    public void setCourse_id_fk(int course_id_fk) {
        this.course_id_fk = course_id_fk;
    }

    public void setNoteTitle(String noteTitle) {
        this.noteTitle = noteTitle;
    }

    public void setNoteText(String noteText) {
        this.noteText = noteText;
    }
}