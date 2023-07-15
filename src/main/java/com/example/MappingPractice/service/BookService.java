package com.example.MappingPractice.service;

import com.example.MappingPractice.model.Book;
import com.example.MappingPractice.repository.IBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    IBookRepo iBookRepo;
    public void addBook(Book book) {
        iBookRepo.save(book);
    }

    public List<Book> getAllBookById(String book) {
        return iBookRepo.findAll(book);
    }
}
