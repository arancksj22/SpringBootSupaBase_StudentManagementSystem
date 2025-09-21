package com.example.SpringBootSupaBase_StudentManagementSystem;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

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
        return service.findById();
    }
}
