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
    private int subjectId;

    @ManyToOne
    @JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false)
    private int subject;

    @Column(name = "student_id")
    private int studentId;

    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "id", insertable = false, updatable = false)
    private int student;

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public int getSubject() {
        return subject;
    }

    public void setSubject(int subject) {
        this.subject = subject;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getStudent() {
        return student;
    }

    public void setStudent(int student) {
        this.student = student;
    }

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
