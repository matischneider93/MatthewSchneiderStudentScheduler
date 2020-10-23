package com.example.matthewschneiderstudentscheduler.databases;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.matthewschneiderstudentscheduler.models.Mentor;

import java.util.List;

@Dao
public interface MentorDao {
    @Query("SELECT * FROM mentor_table ORDER BY mentorId")
    List<Mentor> getMentorList();

    @Query("SELECT * FROM mentor_table WHERE mentorid = :mentorId ORDER BY mentorid")
    Mentor getMentor(int mentorId);

    @Query("SELECT * FROM mentor_table")
    List<Mentor> getAllMentors();

    @Query("SELECT * FROM mentor_table WHERE course_id_fk = :courseId ORDER BY course_id_fk")
    List<Mentor> getMentorsByCourse(int courseId);


    @Insert
    void insertMentor(Mentor mentor);

    @Insert
    void insertAll(Mentor... mentor);

    @Update
    void updateMentor(Mentor mentor);

    @Delete
    void deleteMentor(Mentor mentor);

    @Query("DELETE FROM mentor_table")
    void deleteAllMentors();
}