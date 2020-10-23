package com.example.matthewschneiderstudentscheduler.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import java.util.Date;

import static androidx.room.ForeignKey.CASCADE;

@Entity(tableName = "assessment_table",
        foreignKeys = @ForeignKey(entity = Course.class, parentColumns = "course_id", childColumns = "course_id_fk",
                onDelete = CASCADE))
public class Assessment {
    // Variables
    @PrimaryKey(autoGenerate = true)
    private int assessmentId;
    @ColumnInfo(name = "course_id_fk")
    private int course_id_fk;
    @ColumnInfo(name = "assessmentTitle")
    private String assessmentTitle;
    @ColumnInfo(name = "assessmentType")
    private String assessmentType;
    @ColumnInfo(name = "dueDate")
    private Date dueDate;


    // Empty Constructor
    public Assessment() {
    }

    // Constructor
    public Assessment(int assessmentId, int course_id_fk, String assessmentTitle, String assessmentType, Date dueDate) {
        this.assessmentId = assessmentId;
        this.course_id_fk = course_id_fk;
        this.assessmentTitle = assessmentTitle;
        this.assessmentType = assessmentType;
        this.dueDate = dueDate;
    }

    // Getters
    public int getAssessmentId() {
        return assessmentId;
    }

    public int getCourse_id_fk() {
        return course_id_fk;
    }

    public String getAssessmentTitle() {
        return assessmentTitle;
    }

    public String getAssessmentType() {
        return assessmentType;
    }

    public Date getDueDate() {
        return dueDate;
    }

    // Setters
    public void setAssessmentId(int assessmentId) {
        this.assessmentId = assessmentId;
    }

    public void setCourse_id_fk(int course_id_fk) {
        this.course_id_fk = course_id_fk;
    }

    public void setAssessmentTitle(String assessmentTitle) {
        this.assessmentTitle = assessmentTitle;
    }

    public void setAssessmentType(String assessmentType) {
        this.assessmentType = assessmentType;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
}
