package com.example.SpringBootSupaBase_StudentManagementSystem;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentModel {

    @Id
    private int id;

    private int roll;
    private char division;
    private int marks;
    private long sapId;

    public StudentModel(int id, int roll, char division, int marks, long sapId) {
        this.id = id;
        this.roll = roll;
        this.division = division;
        this.marks = marks;
        this.sapId = sapId;
    }

    public int getId() {
        return id;
    }

    public int getRoll() {
        return roll;
    }

    public char getDivision() {
        return division;
    }

    public int getMarks() {
        return marks;
    }

    public long getSapId() {
        return sapId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setDivision(char division) {
        this.division = division;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void setSapId(long sapId) {
        this.sapId = sapId;
    }

    @Override
    public String toString() {
        return "StudentModel{" +
                "id=" + id +
                ", roll=" + roll +
                ", division=" + division +
                ", marks=" + marks +
                ", sapId=" + sapId +
                '}';
    }
}
