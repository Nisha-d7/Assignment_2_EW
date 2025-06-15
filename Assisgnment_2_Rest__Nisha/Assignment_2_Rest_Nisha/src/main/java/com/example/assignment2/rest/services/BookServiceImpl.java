package com.example.assignment2.rest.services;

import com.example.assignment2.rest.models.Book;
import com.example.assignment2.rest.repositories.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public HashSet<Book> findAllBook() {
        return new HashSet<>(bookRepository.findAll());
    }

    @Override
    public Book findBookById(long id) {
        return bookRepository.findById(id).orElse(null);
    }

    @Override
    public void addBook(Book b) {
        bookRepository.save(b);
    }

    @Override
    public void deleteAllData() {
        bookRepository.deleteAll();
    }
}