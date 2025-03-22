package com.security.authentication_service.controller;

import com.security.authentication_service.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    List<Student> studentList = new ArrayList<>(List.of(
            new Student("Pankaj", 31, 50000),
            new Student("James", 20,54000)
    ));
    @GetMapping("/students")
    public List<Student> getStudents(){
        return studentList;
    }

    @PostMapping("/students")
    public Student createStudent(@RequestBody Student student){
        studentList.add(student);
        return student;
    }

    @GetMapping("/csrf")
    public CsrfToken getToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }

}
