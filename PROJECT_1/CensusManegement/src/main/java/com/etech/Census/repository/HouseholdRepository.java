package com.etech.Census.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.etech.Census.entity.Household;

public interface HouseholdRepository extends JpaRepository<Household, Long> {
	long count();
	 
}
