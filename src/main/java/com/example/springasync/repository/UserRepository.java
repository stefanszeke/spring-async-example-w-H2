package com.example.springasync.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springasync.model.User;


public interface UserRepository extends JpaRepository<User, Long> {
  
}
