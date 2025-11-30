package com.etech.Census.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etech.Census.entity.User;
import com.etech.Census.repository.UserRepository;
import com.etech.Census.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User registerUser(User user) {

        // Example: Check duplicate user
        User existingUser = userRepository.findByWorkerId(user.getWorkerId());
        if (existingUser != null) {
            throw new RuntimeException("Worker ID already exists!");
        }

        // Save user to DB
        return userRepository.save(user);
    }
}
