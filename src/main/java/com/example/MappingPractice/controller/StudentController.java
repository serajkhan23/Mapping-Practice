package com.example.MappingPractice.controller;

import com.example.MappingPractice.model.Laptop;
import com.example.MappingPractice.model.Student;
import com.example.MappingPractice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("Student")
    public void addStudent(@RequestBody Student student)
    {
        studentService.addStudent(student);
    }
    @GetMapping("studentId")
    public List<Student> getAllStudentById(@PathVariable String student)
    {
        return  studentService.getAllStudentById(student);
    }
}
