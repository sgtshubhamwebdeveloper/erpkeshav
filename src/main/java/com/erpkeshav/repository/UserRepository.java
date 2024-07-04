package com.erpkeshav.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erpkeshav.entity.User;

public interface UserRepository extends JpaRepository<User,String> {
    User findByUsername(String username);
}
