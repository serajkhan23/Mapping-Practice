package com.example.MappingPractice.repository;

import com.example.MappingPractice.model.Address;
import com.example.MappingPractice.model.Laptop;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ILaptopRepo extends CrudRepository<Laptop,String> {


    List<Laptop> findAll(String laptop);
}
