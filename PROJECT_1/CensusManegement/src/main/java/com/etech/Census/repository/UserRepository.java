package com.etech.Census.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etech.Census.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByWorkerId(String workerId);

}
