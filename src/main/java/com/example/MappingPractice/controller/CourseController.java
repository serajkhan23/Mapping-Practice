package com.example.MappingPractice.controller;

import com.example.MappingPractice.model.Book;
import com.example.MappingPractice.model.Course;
import com.example.MappingPractice.model.Laptop;
import com.example.MappingPractice.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CourseService courseService;
    @PostMapping("Course")
    public void addCourse(@RequestBody Course course)
    {
        courseService.addCourse(course);
    }
    @GetMapping("courseId")
    public List<Course> getAllCourseById(@PathVariable String course)
    {
        return  courseService.getAllCourseById(course);
    }
}
