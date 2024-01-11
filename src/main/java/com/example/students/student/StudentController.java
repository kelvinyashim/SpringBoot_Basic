package com.ng.edu.binghamuni.park.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping
    public List<Student> hello(){
        return  studentService.hello();

    }
}
