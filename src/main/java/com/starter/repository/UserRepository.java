package com.starter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.starter.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}