package org.example;

import java.util.List;

import lombok.*;

@Data
public class Student {
    private int id;
    private String name;
    private int age;
    private List<String> Subjects;



//    public Student (int id,String name,int age, List<String>Subjects){
//        this.id=age;
//        this.name=name;
//        this.age=age;
//        this.Subjects=Subjects;
//    }
//
//
//    public int getId(){
//        return age;
//
//    }
//    public void setId(int id){
//        this.id=id;
//    }
//    public int getAge(){
//        return age;
//    }
//    public void setAge(int age){
//        this.age=age;
//    }
//    public String getName(){
//        return name;
//    }
//    public void setName(String name){
//        this.name=name;
//    }
//    public List<String> getSubjects(){
//        return Subjects;
//    }
//    public void setSubjects(List<String>Subjects){
//        this.Subjects=Subjects;
//    }

}