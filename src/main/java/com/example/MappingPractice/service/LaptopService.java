package com.example.MappingPractice.service;

import com.example.MappingPractice.model.Laptop;
import com.example.MappingPractice.repository.ILaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LaptopService {
    @Autowired
    ILaptopRepo iLaptopRepo;
    public void addLaptop(Laptop laptop) {
        iLaptopRepo.save(laptop);

    }

    public List<Laptop> getAllLaptopById(String laptop) {
        return iLaptopRepo.findAll(laptop);
    }
}
