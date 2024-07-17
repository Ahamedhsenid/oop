package com.example.spring;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Student {


    private String id;
    private String name;
    private LocalDate dateOfBirth;
    private double average;

}
