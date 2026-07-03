package com.example.SpringAIDemo.controller;

import org.springframework.ai.anthropic.AnthropicChatModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/anthropic")
@CrossOrigin("*")
public class AnthropicController {


    private AnthropicChatModel chatModel;


    private AnthropicController(AnthropicChatModel chatModel) {
        this.chatModel = chatModel;
    }

    @GetMapping("/{message}")
    public ResponseEntity<String> getAnswer(@PathVariable String message) {
        String response = chatModel.call(message);
        return ResponseEntity.ok(response);
    }

}
