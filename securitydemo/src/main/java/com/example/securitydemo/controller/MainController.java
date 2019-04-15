package com.example.securitydemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/xxxxxx")
public class MainController {

    public String login() {
        return "login";
    }
}
