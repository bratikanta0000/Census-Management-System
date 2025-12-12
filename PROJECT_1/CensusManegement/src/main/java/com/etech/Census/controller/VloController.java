package com.etech.Census.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.etech.Census.repository.AdminDetailsRepository;
import com.etech.Census.repository.HouseholdRepository;
import com.etech.Census.repository.MemberRepository;
import com.etech.Census.repository.VloRepository;


@Controller
public class VloController {

      @Autowired
      private VloRepository vloRepository;
	
	  @Autowired 
	  private AdminDetailsRepository adminDetailsRepository;
	  
	  @Autowired
	  private HouseholdRepository householdRepository;
	  
	  @Autowired
	  private MemberRepository memberRepository;
	  
	  
	 

    @GetMapping("/successfuladminlogin")
    public String showDashboard(Model model) {

        long totalVlo = vloRepository.count();
        long totalAdmins = adminDetailsRepository.count();
        long totalHouseholds = householdRepository.count();
        long totalMembers = memberRepository.count();
        
        long totalPeople = totalHouseholds + totalMembers;
        
        System.out.println("VLO COUNT = " + totalVlo);
        System.out.println("ADMIN COUNT = " + totalAdmins);
        System.out.println("HOUSEHOLD COUNT = " + totalHouseholds);
        System.out.println("MEMBER COUNT = " + totalMembers);
        System.out.println("TOTAL PEOPLE COUNT = " + totalPeople);
        

        model.addAttribute("totalVlo", totalVlo);
        model.addAttribute("totalAdmins", totalAdmins);
        model.addAttribute("totalHouseholds", totalHouseholds);
        model.addAttribute("totalMembers", totalMembers);
        model.addAttribute("totalPeople", totalPeople);
       
        

        return "admindashboard";

    }
}
