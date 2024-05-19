package com.ibraisi.LTHesisAIBot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/generate")
    public String chatBot(){
        return "chatBot";
    }


}
