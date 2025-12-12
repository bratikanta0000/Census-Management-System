package com.etech.Census.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.etech.Census.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
	
}
