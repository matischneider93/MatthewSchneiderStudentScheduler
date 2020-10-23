package com.example.matthewschneiderstudentscheduler.models;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "term_table")
public class Term {
    // Variables
    @PrimaryKey(autoGenerate = true)
    private int termId;
    @ColumnInfo(name = "termName")
    private String termName;
    @ColumnInfo(name = "termStart")
    private Date termStart;
    @ColumnInfo(name = "termEnd")
    private Date termEnd;

    // Empty Constructor
    public Term() {
    }

    // Constructor

    public Term(int termId, String termName, Date termStart, Date termEnd) {
        this.termId = termId;
        this.termName = termName;
        this.termStart = termStart;
        this.termEnd = termEnd;
    }


    // Getters

    public int getTermId() {
        return termId;
    }

    public String getTermName() {
        return termName;
    }

    public Date getTermStart() {
        return termStart;
    }

    public Date getTermEnd() {
        return termEnd;
    }

    // Setters

    public void setTermId(int termId) {
        this.termId = termId;
    }

    public void setTermName(String termName) {
        this.termName = termName;
    }

    public void setTermStart(Date termStart) {
        this.termStart = termStart;
    }

    public void setTermEnd(Date termEnd) {
        this.termEnd = termEnd;
    }
}
