package ru.safronov.security.FirstSecurityApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {



    @GetMapping("/home")
    public String homePage() {
        return "home";
    }


    @GetMapping("/admin")
    public String adminPage() {
        return "admin";
    }
    @GetMapping("/subscriber")
    public String subPage() {
        return "subscriber";
    }
}
