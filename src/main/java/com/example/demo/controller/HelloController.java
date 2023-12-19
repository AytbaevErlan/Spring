package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class HelloController {
    @GetMapping(value = "/")
    public String hello(){
        return "Hello, In my first Spring controller";
    }
    @GetMapping(value = "/greeting")
    public String greeting(@RequestParam(name="name", required = false, defaultValue = "World") String name, Model model){
        model.addAttribute("name", name);
        return "greeting";
    }
}
