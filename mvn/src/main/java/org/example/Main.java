package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to square: ");
        System.out.println("test commit");
        int number=sc.nextInt();
        System.out.println("Square of number is: "+ Squaremethod(number));


        System.out.println("\nstudent details: ");
        List<String> Subjects= Arrays.asList("maths","english","history");
        Student student = new Student();
        student.setId(1);
        student.setName("Jane Doe");
        student.setAge(20);
        student.setSubjects(Subjects);
        System.out.println("ID: "+student.getId());
        System.out.println("name: "+student.getName());
        System.out.println("age: "+student.getAge());
        System.out.println("subjects: "+student.getSubjects());

    }


    public static int Squaremethod(int number){
        return number*number;


    }
}