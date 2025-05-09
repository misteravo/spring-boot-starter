package com.company.starter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.starter.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}