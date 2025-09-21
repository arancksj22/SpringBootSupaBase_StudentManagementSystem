package com.example.SpringBootSupaBase_StudentManagementSystem;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/StudentSystem")
public class MainController {
    MainService service;

    MainController(MainService service){
        this.service = service;
    }

    @GetMapping
    public List<StudentModel> getStudents(){
        return service.viewAllStudents();
    }

    @GetMapping("/{id}")
    public StudentModel getStudentById(@PathVariable int id){
        return service.findById(id);
    }

    @PostMapping
    public StudentModel createStudent(@RequestParam StudentModel student){
        return service.createStudent(student);
    }

    @PutMapping
    public StudentModel updateStudent(@RequestParam StudentModel student){
        return service.updateStudent(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable int id){
        service.deleteStudent(id);
    }
}
