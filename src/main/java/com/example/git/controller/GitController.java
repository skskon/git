package com.example.git.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GitController {

    @GetMapping("/1")
    public String first() {
        return "first";
    }

    @GetMapping("/2")
    public String second() {
        return "second";
    }
}
