package com.example.spring.controller;

import com.example.spring.dto.StudentMapper;
import com.example.spring.dto.StudentRequest;
import com.example.spring.dto.StudentResponse;
import com.example.spring.model.Student;
import com.example.spring.service.Studentservice;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/students")

public class Studentcontroller {


    @Autowired
    private Studentservice studentService;

    @GetMapping
    public ResponseEntity<List<StudentResponse>> getAllStudents() {
        List<StudentResponse> students = studentService.getAllStudents().stream()
                .map(StudentMapper::toResponse)
                .collect(Collectors.toList());
        return ResponseEntity.ok(students);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentResponse> getStudentById(@PathVariable String id) {
        var student = studentService.getStudentById(id);
        if (student == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(StudentMapper.toResponse(student));
    }

    @PostMapping
    public ResponseEntity<StudentResponse> createStudent(@RequestBody StudentRequest studentRequest) {
        Student student = StudentMapper.toEntity(studentRequest);
        Student createdStudent = studentService.createStudent(student);
        return new ResponseEntity<>(StudentMapper.toResponse(createdStudent), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable String id) {
        studentService.deleteStudent(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}


//@RestController: Indicates that this class is a REST controller.
//@RequestMapping("/students"): Base URL for all endpoints in this controller.
//@Autowired: This annotation injects the StudentService bean into this controller.
//@GetMapping, @PostMapping: These annotations map HTTP GET and POST requests to the respective methods.
//@PathVariable: Binds the method parameter to the value of the URI template variable.
//@RequestBody: Binds the method parameter to the body of the HTTP request.
