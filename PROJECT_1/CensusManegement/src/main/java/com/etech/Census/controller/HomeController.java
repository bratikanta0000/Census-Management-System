package com.etech.Census.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String homePage() {
        return "index";
    }

    @GetMapping("/anganwadi-login")
    public String Anganwadilogin() {
    	
        return "Anganwadilogin";  
      
     }
    @GetMapping("/new-registration")
    public String newRegistration() {
		return "newuser";
		
	 }
    @GetMapping("/success-registration")
    public String successRegistration() {
    	
		return "success";
		
	 }
    @GetMapping("/aww-profile")
    public String AwwProfile() {
        return "awwprofile"; 
    }
    @GetMapping("/new_reg_form")
    public String NewregForm() {
        return "newregform"; 
        }
    @GetMapping("/admin-login")
    public String Adminlogin() {
    	
        return "adminlogin";  
    }
	
	  @GetMapping("/admin-register") 
	  public String AdminNewUser() {
	  
	  return "admin-register"; }
	
     
    
}
