package com.example.MappingPractice.controller;


import com.example.MappingPractice.model.Address;
import com.example.MappingPractice.model.Book;
import com.example.MappingPractice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService bookService;
    @PostMapping("Book")
    public void addBook(@RequestBody Book book)
    {
        bookService.addBook(book);
    }
    @GetMapping("bookId")
    public List<Book> getAllBookById(@PathVariable String book)
    {
        return  bookService.getAllBookById(book);
    }
}
