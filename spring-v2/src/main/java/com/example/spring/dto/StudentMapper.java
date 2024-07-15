package com.example.spring.dto;

import com.example.spring.model.Student;


public class StudentMapper {

    public static StudentResponse toResponse(Student student) {
        return new StudentResponse(
                student.getId(),
                student.getName(),
                student.getDateOfBirth(),
                student.getAverage()
        );
    }

    public static Student toEntity(StudentRequest request) {
        Student student = new Student();
        student.setName(request.name());
        student.setDateOfBirth(request.dateOfBirth());
        student.setAverage(request.average());
        return student;
    }
}