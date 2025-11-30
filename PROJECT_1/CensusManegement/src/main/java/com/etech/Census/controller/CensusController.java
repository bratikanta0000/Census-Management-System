package com.etech.Census.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.etech.Census.dto.CensusDTO;
import com.etech.Census.service.CensusService;



@Controller

@RequestMapping("/api/census")
public class CensusController {

    @Autowired
    private CensusService censusService;

    @PostMapping("/save")
    public String saveCensus(@ModelAttribute CensusDTO dto) {
        censusService.saveCensus(dto);
        return "success2";
    }
    @GetMapping("/successfuladminlogin")
    public String showDashboard(Model model) {

        model.addAttribute("adminCount", censusService.getAdminCount());
        model.addAttribute("householdCount", censusService.getHouseholdCount());
        model.addAttribute("memberCount", censusService.getMemberCount());
        model.addAttribute("userCount", censusService.getUserCount());

        return "admindashboard";
}
}

