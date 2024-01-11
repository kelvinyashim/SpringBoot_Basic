package com.ng.edu.binghamuni.park.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public List<Student> hello(){
        return studentRepository.findAll();
    }

}
