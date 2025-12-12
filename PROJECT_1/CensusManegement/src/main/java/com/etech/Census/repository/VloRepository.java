package com.etech.Census.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etech.Census.entity.User;

public interface VloRepository extends JpaRepository<User, Long> {

    long count(); 
}
