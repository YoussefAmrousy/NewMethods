package com.example.demo2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping("/login")
    public String page() {
        return "form.html";
    }

    @PostMapping("/home")
    public String HomePage() {
        return "redirect:/home.html";
    }
}
