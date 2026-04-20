package com.aiplatform.ai_service.dto;

import lombok.Getter;

@Getter
public class AIResponse {
    private String answer;

    public AIResponse(String answer) {
        this.answer = answer;
    }
}
