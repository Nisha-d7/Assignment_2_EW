package com.example.assignment2.rest.services;

import java.util.HashSet;

import com.example.assignment2.rest.models.Book;

public interface BookService {
    HashSet<Book> findAllBook();
    Book findBookById(long id);
    void addBook(Book b);
    void deleteAllData();
}