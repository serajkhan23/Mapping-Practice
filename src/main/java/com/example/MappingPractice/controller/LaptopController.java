package com.example.MappingPractice.controller;

import com.example.MappingPractice.model.Course;
import com.example.MappingPractice.model.Laptop;
import com.example.MappingPractice.model.Student;
import com.example.MappingPractice.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController {
    @Autowired
    LaptopService laptopService;
    @PostMapping("Laptop")
    public void addLaptop(@RequestBody Laptop laptop)
    {
        laptopService.addLaptop(laptop);
    }
    @GetMapping("laptopId")
    public List<Laptop> getAllLaptopById(@PathVariable String laptop)
    {
        return  laptopService.getAllLaptopById(laptop);
    }
}
