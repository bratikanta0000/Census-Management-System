package com.etech.Census.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.etech.Census.entity.AdminDetails;

public interface AdminRepo extends JpaRepository<AdminDetails, Integer> {
	AdminDetails findByAdminid(String adminid);
}
