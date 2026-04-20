package com.aiplatform.ai_service.engine;

import org.springframework.stereotype.Component;

@Component
public class PromptBuilder {

    public String buildPrompt(String context, String question) {
        return """
                You are a fitness and diet coach.

                User context:
                %s

                User question:
                "%s"

                Give:
                - Clear answer
                - Simple explanation
                - Actionable suggestions
                """.formatted(context, question);
    }
}