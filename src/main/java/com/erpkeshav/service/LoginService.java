package com.erpkeshav.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erpkeshav.entity.User;
import com.erpkeshav.repository.UserRepository;

@Service
public class LoginService  {
    @Autowired
    private UserRepository userRepository;

    public authenticate(String username,String password) {
        User user = userRepository.findByUsername(username).orElseThrow();
        if (!user.getPassword().equals(password)) {
            return false;
        }
        return true;
    }
}