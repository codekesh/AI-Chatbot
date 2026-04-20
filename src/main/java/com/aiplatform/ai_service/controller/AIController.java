package com.aiplatform.ai_service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.aiplatform.ai_service.dto.AIRequest;
import com.aiplatform.ai_service.dto.AIResponse;
import com.aiplatform.ai_service.service.AIService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/ai")
@RequiredArgsConstructor
public class AIController {

    private final AIService aiService;

    @PostMapping("/chat")
    public ResponseEntity<AIResponse> chat(
            @RequestBody AIRequest request) {

        String response = aiService.askAI(request.getQuestion());
        return ResponseEntity.ok(new AIResponse(response));
    }

    @GetMapping("/test-ai")
    public String testAI() {
        return aiService.askAI("Give me a simple fitness tip");
    }
}