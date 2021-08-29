package com.springbasics.student;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Component
public class StudentService {

    public List<Student> getStudents(){
        return List.of(new Student(
                1L,
                "Om Narayan Singh",
                "sangam.ale.sa63@gmail.com",
                LocalDate.of(2020, Month.AUGUST, 21),
                23
        ));
    }
}
