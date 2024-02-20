package br.com.chatgpt.gptwithspring.controller;

import br.com.chatgpt.gptwithspring.models.request.Prompt;
import br.com.chatgpt.gptwithspring.service.ChatGptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
@RequestMapping("/api/bot")
public class ChatGPTController {

    @Autowired
    private ChatGptService service;

    // HOST/bot/chat
    @PostMapping("/chat")
    public String chat(@RequestBody Prompt prompt) {// throws JsonProcessingException {
        System.out.println("CAIU AQ");
        return service.chat(prompt.prompt());
    }

}
