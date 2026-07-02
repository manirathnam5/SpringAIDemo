package com.example.SpringAIDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class AnthropicController {



    @GetMapping("/ai")
    public String shwoAI(){
         return " AI app "  ;
    }
}
