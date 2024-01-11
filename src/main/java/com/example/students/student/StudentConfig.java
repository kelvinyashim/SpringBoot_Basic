package com.ng.edu.binghamuni.park.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
CommandLineRunner commandLineRunner(StudentRepository repository){
    return args -> {
      Student mariam =  new Student(
                        "Mariam",
                        "Josj@gmail.com",
                        LocalDate.of(2002,03,22),
                        33
    );
        Student joshua =  new Student(
                "Joshua",
                "Josj@gmail.com",
                LocalDate.of(2002,03,22),
                33
        );
        repository.saveAll(List.of(mariam,joshua));
    };

}
}
