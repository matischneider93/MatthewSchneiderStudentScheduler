package com.example.matthewschneiderstudentscheduler.databases;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.matthewschneiderstudentscheduler.models.Course;

import java.util.List;

@Dao
public interface CourseDao {
    @Query("SELECT * FROM course_table ORDER BY courseId")
    List<Course> getCourseList();

    @Query("SELECT * FROM course_table WHERE courseId = :courseId ORDER BY courseId")
    Course getCourse(int courseId);

    @Query("SELECT * FROM course_table")
    List<Course> getAllCourses();

    @Query("SELECT * FROM course_table WHERE term_id_fk = :termId ORDER BY course_id")
    List<Course> getCoursesByTerm(int termId);


    @Insert
    void insertCourse(Course course);

    @Insert
    void insertAll(Course... course);

    @Update
    void updateCourse(Course course);

    @Delete
    void deleteCourse(Course course);

    @Query("DELETE FROM course_table")
    void deleteAllCourses();
}