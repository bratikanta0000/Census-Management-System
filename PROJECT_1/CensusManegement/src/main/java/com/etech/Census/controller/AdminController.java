package com.etech.Census.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;
import com.etech.Census.entity.AdminDetails;
import com.etech.Census.service.AdminService;

@Controller
@RequiredArgsConstructor
public class AdminController {

    private final AdminService service;

    @PostMapping("/register/new")
    public String registerAdmin(@ModelAttribute AdminDetails admin) {

        service.saveAdmin(admin);

        return "success"; // success.html
    }
    @PostMapping("/successfuladminlogin")
    public String loginSuccess(@RequestParam("adminid") String adminid,
                               @RequestParam("password") String password) {

        boolean ok = service.validateAdmin(adminid, password);

        if (ok) {
        	return "redirect:/successfuladminlogin";
        } else {
            return "adminlogin";      // on failure
        }
    }
}
