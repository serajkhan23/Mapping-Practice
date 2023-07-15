package com.example.MappingPractice.service;

import com.example.MappingPractice.model.Course;
import com.example.MappingPractice.repository.ICourseRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CourseService {
    @Autowired
    ICourseRepo iCourseRepo;

    public void addCourse(Course course) {
        iCourseRepo.save(course);
    }

    public List<Course> getAllCourseById(String course) {
        return iCourseRepo.findAll(course);
    }
}
