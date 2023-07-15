package com.example.MappingPractice.service;

import com.example.MappingPractice.model.Student;
import com.example.MappingPractice.repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentService {
    @Autowired
    IStudentRepo iStudentRepo;
    public void addStudent(Student student) {
        iStudentRepo.save(student);
    }

    public List<Student> getAllStudentById(String student) {
        return iStudentRepo.findAll(student);
    }
}
