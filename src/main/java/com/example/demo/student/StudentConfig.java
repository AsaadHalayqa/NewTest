package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    CommandLineRunner commandLineRunner( StudentRepository repository){
        return args -> {
           Student Asaad= new Student(
                    "Asaad Halayqa",
                    "asadeid1999@gmail.com",
                    LocalDate.of(1999, 11, 15),
                    22
            );
            Student Mariam= new Student(
                    "Mariam",
                    "mmmm@gmail.com",
                    LocalDate.of(1998, 10, 20),
                    23
            );
            repository.saveAll(
                    List.of(Asaad, Mariam)
            );
        };
    }
}
