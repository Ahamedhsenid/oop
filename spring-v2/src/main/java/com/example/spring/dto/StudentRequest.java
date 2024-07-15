package com.example.spring.dto;

import lombok.Data;

import java.time.LocalDate;
// StudentRequest.java




public record StudentRequest(String name, LocalDate dateOfBirth, double average) {}