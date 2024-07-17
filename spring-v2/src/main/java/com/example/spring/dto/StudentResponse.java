package com.example.spring.dto;


import java.time.LocalDate;


public record StudentResponse(String id, String name, LocalDate dateOfBirth, double average) {}