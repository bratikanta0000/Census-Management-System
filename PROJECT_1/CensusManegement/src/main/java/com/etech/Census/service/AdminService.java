package com.etech.Census.service;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import com.etech.Census.entity.AdminDetails;
import com.etech.Census.repository.AdminRepo;

@Service
@RequiredArgsConstructor
public class AdminService {

    private final AdminRepo repo;  // Lombok auto injects
    
    public boolean validateAdmin(String adminid, String password) {
    	 AdminDetails admin = repo.findByAdminid(adminid);

         if (admin == null) {
             return false;
         }

         return admin.getPassword().equals(password);
	}

    public AdminDetails saveAdmin(AdminDetails admin) {
        return repo.save(admin);
    }
}
