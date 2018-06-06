package com.example.demo.controller;

import com.example.demo.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bus on 2018/6/5.
 */
@RestController
public class HelloController {
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/student")
    public List<Student> getStudent(){
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(1L,"liudi1"));
        students.add(new Student(2L,"yakun"));
        students.add(new Student(3L,"tangliang"));
        students.add(new Student(4L,"liuming"));
        return students;
    }
}
