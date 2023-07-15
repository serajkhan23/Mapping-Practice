package com.example.MappingPractice.repository;

import com.example.MappingPractice.model.Address;
import com.example.MappingPractice.model.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IStudentRepo extends CrudRepository<Student,Long> {

    List<Student> findAll(String student);
}
