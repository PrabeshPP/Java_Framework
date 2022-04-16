package com.springdemo.helloworld.student;

import java.util.Date;

public class Student {
    private Long id;
    private  String name;
    private  int age;
    private Date date;
    private  String email;

    public Student(){

    }

    public Student(Long id,String name,int age,Date date,String email){
        this.id=id;
        this.name=name;
        this.age=age;
        this.date=date;
        this.email=email;
    }

}
