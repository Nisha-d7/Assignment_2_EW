package com.example.assignment2.rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.assignment2.rest.models.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {

}
