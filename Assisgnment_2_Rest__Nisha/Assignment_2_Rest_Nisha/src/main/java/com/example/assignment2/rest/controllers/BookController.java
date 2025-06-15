package com.example.assignment2.rest.controllers;

import com.example.assignment2.rest.models.Book;
import com.example.assignment2.rest.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;

@RestController
@RequestMapping("/api/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping("/")
    public void addBook(@RequestBody Book book) {
        bookService.addBook(book);
    }

    @GetMapping("/findall")
    public HashSet<Book> getAllBooks() {
        return bookService.findAllBook();
    }

    @GetMapping("/findbyid/{id}")
    public Book getBookById(@PathVariable long id) {
        return bookService.findBookById(id);
    }
}