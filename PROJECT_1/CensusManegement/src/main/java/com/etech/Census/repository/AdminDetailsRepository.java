package com.etech.Census.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.etech.Census.entity.AdminDetails;

public interface AdminDetailsRepository extends JpaRepository<AdminDetails, Long> {
	long count();
	

}
