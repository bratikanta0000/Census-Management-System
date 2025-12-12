package com.etech.Census.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.etech.Census.entity.User;
import com.etech.Census.service.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register/new/user")
    public String registerUser(User user, RedirectAttributes redirectAttributes) {

        try {
            User savedUser = userService.registerUser(user);

            String name = savedUser.getFullName() != null ? savedUser.getFullName() : savedUser.getWorkerId();

            redirectAttributes.addFlashAttribute("message",
                    "User " + name + " registered successfully!");

            return "redirect:/success-registration";

        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("error",
                    "Error registering user: " + e.getMessage());
            return "redirect:/success-registration";
        }
    }
}

