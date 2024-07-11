package com.example.spring.controller;

import com.example.spring.Student;
import com.example.spring.service.Studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")

public class Studentcontroller {

    @Autowired
    private Studentservice studentService;

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable String id) {
        return studentService.getStudentById(id);
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable String id) {
        studentService.deleteStudent(id);
    }
}


//@RestController: Indicates that this class is a REST controller.
//@RequestMapping("/students"): Base URL for all endpoints in this controller.
//@Autowired: This annotation injects the StudentService bean into this controller.
//@GetMapping, @PostMapping: These annotations map HTTP GET and POST requests to the respective methods.
//@PathVariable: Binds the method parameter to the value of the URI template variable.
//@RequestBody: Binds the method parameter to the body of the HTTP request.
