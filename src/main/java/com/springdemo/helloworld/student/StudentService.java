package com.springdemo.helloworld.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class StudentService {
    public List<Student> getStudents(){
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
