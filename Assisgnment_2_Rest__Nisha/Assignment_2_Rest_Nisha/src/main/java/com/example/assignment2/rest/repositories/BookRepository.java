package com.example.assignment2.rest.repositories;

import com.example.assignment2.rest.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}