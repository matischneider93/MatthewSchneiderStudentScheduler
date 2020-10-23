package com.example.matthewschneiderstudentscheduler.databases;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.matthewschneiderstudentscheduler.models.Assessment;

import java.util.List;

@Dao
public interface AssessmentDao {
    @Query("SELECT * FROM assessment_table ORDER BY assessmentId")
    List<Assessment> getAssessmentList();

    @Query("SELECT * FROM assessment_table WHERE assessmentId = :assessmentId ORDER BY assessmentId")
    Assessment getAssessment(int assessmentId);

    @Query("SELECT * FROM assessment_table")
    List<Assessment> getAllAssessments();

    @Query("SELECT * FROM assessment_table WHERE course_id_fk = :courseId ORDER BY assessmentId")
    List<Assessment> getAssessmentsByCourse(int courseId);


    @Insert
    void insertAssessment(Assessment assessment);

    @Insert
    void insertAll(Assessment... assessment);

    @Update
    void updateAssessment(Assessment assessment);

    @Delete
    void deleteAssessment(Assessment assessment);

    @Query("DELETE FROM assessment_table")
    void deleteAllAssessments();
}