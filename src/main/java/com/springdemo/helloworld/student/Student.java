package com.springdemo.helloworld.student;

import org.apache.tomcat.jni.Local;

import java.time.LocalDate;
import java.util.Date;

public class Student {
    private Long id;
    private  String name;
    private  int age;
    private LocalDate date;
    private  String email;

    public Student(){

    }

    public Student(Long id,String name,int age,LocalDate date,String email){
        this.id=id;
        this.name=name;
        this.age=age;
        this.date=date;
        this.email=email;
    }

    public Student(String name,int age,LocalDate date,String email){
        this.name=name;
        this.age=age;
        this.date=date;
        this.email=email;
    }
    public void setId(Long id){
        this.id=id;
    }
    public void setAge(int age){
        this.age=age;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setDate(LocalDate date){
        this.date=date;
    }

    public void setEmail(String email){
        this.email=email;
    }







}
