package com.example.assignment2.rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.assignment2.rest.models.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
