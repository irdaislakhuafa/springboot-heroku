package com.irdaislakhuafa.springbootheroku.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class IndexController {
    @GetMapping("/")
    public String index(Model model) {
        try {
            model.addAttribute("title", "Spring Boot with Heroku Test");
            model.addAttribute("myName", "irda islakhu afa");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "index";
    }
}
