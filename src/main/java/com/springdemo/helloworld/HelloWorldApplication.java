package com.springdemo.helloworld;

import com.springdemo.helloworld.student.Student;
import org.apache.tomcat.jni.Local;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
@RestController
public class HelloWorldApplication {

    public static void main(String[] args) {

        SpringApplication.run(HelloWorldApplication.class, args);
    }
    @GetMapping
    public List<Student> hello(){
        return List.of(
                new Student(
                        1L,
                        "Prabesh Bista",
                        20,
                        LocalDate.of(2060,3,21),
                        "prabesh.bista400@gmail.com"



                )
        );
    }


}
