package com.example.models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class SubjectStudent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "subject_id")
    private int SubjectId;

    @ManyToOne
    @JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false)
    private int Subject;

    @Column(name = "student_id")
    private int studentId;

    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "id", insertable = false, updatable = false)
    private int student;

    public SubjectStudent() {
    }

    public SubjectStudent(Subject subject, Student student) {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
