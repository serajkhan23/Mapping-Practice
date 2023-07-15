package com.example.MappingPractice.repository;


import com.example.MappingPractice.model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IBookRepo extends CrudRepository<Book,String> {


    List<Book> findAll(String book);
}
