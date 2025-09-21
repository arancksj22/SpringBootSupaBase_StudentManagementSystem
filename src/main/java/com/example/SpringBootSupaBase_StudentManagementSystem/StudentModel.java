package com.example.SpringBootSupaBase_StudentManagementSystem;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentModel {

    @Id
    private final int id;

    private final int roll;
    private final int marks;
    private final long sapId;

}
