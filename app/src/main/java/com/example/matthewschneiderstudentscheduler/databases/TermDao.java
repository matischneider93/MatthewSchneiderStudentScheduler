package com.example.matthewschneiderstudentscheduler.databases;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.matthewschneiderstudentscheduler.models.Term;

import java.util.List;

@Dao
public interface TermDao {

    @Query("SELECT * FROM term_table ORDER BY termId")
    List<Term> getTermList();

    @Query("SELECT * FROM term_table WHERE termId = :termId ORDER BY termId")
    Term getTerm(int termId);

    @Query("SELECT * FROM term_table")
    List<Term> getAllTerms();

    @Insert
    void insertTerm(Term term);

    @Insert
    void insertAll(Term... term);

    @Update
    void updateTerm(Term term);

    @Delete
    void deleteTerm(Term term);

    @Query("DELETE FROM term_table")
    void deleteAllTerms();
}