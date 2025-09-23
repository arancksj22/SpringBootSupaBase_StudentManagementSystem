package com.example.SpringBootSupaBase_StudentManagementSystem;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
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
    public StudentModel createStudent(@RequestBody StudentModel student){
        return service.createStudent(student);
    }

    @PutMapping
    public StudentModel updateStudent(@RequestBody StudentModel student){
        return service.updateStudent(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable int id){
        service.deleteStudent(id);
    }
}
