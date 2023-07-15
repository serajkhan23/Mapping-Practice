package com.example.MappingPractice.repository;

import com.example.MappingPractice.model.Address;
import com.example.MappingPractice.model.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ICourseRepo extends CrudRepository<Course,String> {

    List<Course> findAll(String course);
}
