package com.turing.sb2.controller;

import com.turing.sb2.entitty.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Value("${app.id}")
    private Integer id;

    @Value("${app.name}")
    private String name;

    @Value("${app.age}")
    private Integer age;

    @Value("${app.sex}")
    private String sex;

    @Autowired
    private Student stu;

    @GetMapping("/msg")
    public String msg(){
        return "id="+id+" name="+name+" age="+age+" sex="+sex;
    }

    @GetMapping("/stu")
    public Student stu(){
        return stu;
    }
}
