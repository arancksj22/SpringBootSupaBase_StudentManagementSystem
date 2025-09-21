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

    public StudentModel createStudent(StudentModel student){
        return repo.save(student);
    }

    public void deleteStudent(int id){
        repo.deleteById(id);
    }

    public StudentModel updateStudent(StudentModel newStudent){
        StudentModel existing = repo.findById(newStudent.getId())
                                .orElseThrow(() -> new RuntimeException("Does not exist"));

        existing.setId(newStudent.getId());
        existing.setDivision(newStudent.getDivision());
        existing.setMarks(newStudent.getMarks());
        existing.setRoll(newStudent.getRoll());
        existing.setSapId(newStudent.getSapId());

        return repo.save(existing);
    }


}
