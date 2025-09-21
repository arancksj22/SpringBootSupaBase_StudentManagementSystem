package com.example.SpringBootSupaBase_StudentManagementSystem;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainService {

    MainRepository repo;

    MainService(MainRepository repo){
        this.repo = repo;
    }

    public List<StudentModel> viewAllStudents(){
        return repo.findAll();
    }

    public StudentModel findById(int id){
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("No Student with Id"));
    }


}
