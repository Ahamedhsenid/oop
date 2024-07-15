package com.example.spring.service;

import com.example.spring.exception.ResourceNotFoundException;
import com.example.spring.model.Student;
import com.example.spring.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
public class Studentservice {

//    private static final Logger logger = LoggerFactory.getLogger(Studentservice.class);

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        log.info("Fetching all students!");
        return studentRepository.findAll();
    }

    public Student getStudentById(String id) {
        log.info("Fetching student with id: {}", id);
        return studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found with id: " + id));
    }

    public Student createStudent(Student student) {
        log.info("Creating new student");
        return studentRepository.save(student);
    }

    public void deleteStudent(String id) {
        log.info("Deleting student with id: {}", id);
        if (!studentRepository.existsById(id)) {
            throw new ResourceNotFoundException("Student not found with id: " + id);
        }
        studentRepository.deleteById(id);
    }
}
