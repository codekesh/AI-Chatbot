package com.aiplatform.ai_service.service;

import org.springframework.stereotype.Service;

import com.aiplatform.ai_service.client.OpenAIClient;
import com.aiplatform.ai_service.engine.PromptBuilder;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AIService {

    private final PromptBuilder promptBuilder;
    private final OpenAIClient openAIClient;

    public String askAI(String question) {
        String context = "No data provided";
        String prompt = promptBuilder.buildPrompt(context, question);
        return openAIClient.getResponse(prompt);
    }
}