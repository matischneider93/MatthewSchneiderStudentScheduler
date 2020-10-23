package com.example.matthewschneiderstudentscheduler.models;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import java.util.Date;

import static androidx.room.ForeignKey.CASCADE;

@Entity(tableName = "course_table",
        foreignKeys = @ForeignKey(entity = Term.class, parentColumns = "termId", childColumns = "term_id_fk",
                onDelete = CASCADE)
)
public class Course {
    // Variables
    @PrimaryKey(autoGenerate = true)
    private int courseId;
    @ColumnInfo(name = "term_id_fk")
    private int term_id_fk;
    @ColumnInfo(name = "courseName")
    private String courseName;
    @ColumnInfo(name = "courseStart")
    private Date course_start;
    @ColumnInfo(name = "courseEnd")
    private Date courseEnd;
    @ColumnInfo(name = "courseStatus")
    private String courseStatus;
    @ColumnInfo(name = "courseAlertDate")
    private Date courseAlertDate;

    // Empty Constructor
    public Course() {
    }
    // Constructor

    public Course(int courseId, int term_id_fk, String courseName, Date course_start, Date courseEnd, String courseStatus, Date courseAlertDate) {
        this.courseId = courseId;
        this.term_id_fk = term_id_fk;
        this.courseName = courseName;
        this.course_start = course_start;
        this.courseEnd = courseEnd;
        this.courseStatus = courseStatus;
        this.courseAlertDate = courseAlertDate;
    }


    // Getters
    public int getCourseId() {
        return courseId;
    }

    public int getTerm_id_fk() {
        return term_id_fk;
    }

    public String getCourseName() {
        return courseName;
    }

    public Date getCourse_start() {
        return course_start;
    }

    public Date getCourseEnd() {
        return courseEnd;
    }

    public String getCourseStatus() {
        return courseStatus;
    }

    public Date getCourseAlertDate() {
        return courseAlertDate;
    }

    // Setters
    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void setTerm_id_fk(int term_id_fk) {
        this.term_id_fk = term_id_fk;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourse_start(Date course_start) {
        this.course_start = course_start;
    }

    public void setCourseEnd(Date courseEnd) {
        this.courseEnd = courseEnd;
    }

    public void setCourseStatus(String courseStatus) {
        this.courseStatus = courseStatus;
    }

    public void setCourseAlertDate(Date courseAlertDate) {
        this.courseAlertDate = courseAlertDate;
    }
}
