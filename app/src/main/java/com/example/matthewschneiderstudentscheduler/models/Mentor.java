package com.example.matthewschneiderstudentscheduler.models;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import static androidx.room.ForeignKey.CASCADE;

@Entity(tableName = "mentor_table",
        foreignKeys = @ForeignKey(entity = Course.class, parentColumns = "course_id", childColumns = "course_id_fk",
                onDelete = CASCADE)
)
public class Mentor {
    // Variables
    @PrimaryKey(autoGenerate = true)
    private int mentorId;
    @ColumnInfo(name = "mentorName")
    private String mentorName;
    @ColumnInfo(name = "course_id_fk")
    private int course_id_fk;
    @ColumnInfo(name = "mentorPhone")
    private String mentorPhone;
    @ColumnInfo(name = "mentorEmail")
    private String mentorEmail;


    // Empty Constructor
    public Mentor() {
    }

    // Constructor

    public Mentor(int mentorId, String mentorName, int course_id_fk, String mentorPhone, String mentorEmail) {
        this.mentorId = mentorId;
        this.mentorName = mentorName;
        this.course_id_fk = course_id_fk;
        this.mentorPhone = mentorPhone;
        this.mentorEmail = mentorEmail;
    }

    // Getters

    public int getMentorId() {
        return mentorId;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getCourse_id_fk() {
        return course_id_fk;
    }

    public String getMentorPhone() {
        return mentorPhone;
    }

    public String getMentorEmail() {
        return mentorEmail;
    }

    // Setters
    public void setMentorId(int mentorId) {
        this.mentorId = mentorId;
    }

    public void setMentorName(String mentorName) {
        this.mentorName = mentorName;
    }

    public void setCourse_id_fk(int course_id_fk) {
        this.course_id_fk = course_id_fk;
    }

    public void setMentorPhone(String mentorPhone) {
        this.mentorPhone = mentorPhone;
    }

    public void setMentorEmail(String mentorEmail) {
        this.mentorEmail = mentorEmail;
    }
}
