package com.example.spring.dto;

import lombok.Data;
import java.time.LocalDate;

//@Data
public record StudentResponse(String id, String name, LocalDate dateOfBirth, double average) {}