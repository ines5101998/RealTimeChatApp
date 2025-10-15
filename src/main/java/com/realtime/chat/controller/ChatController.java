package com.realtime.chat.controller;

import com.realtime.chat.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {

    /**
     * Méthode qui reçoit un message envoyé depuis le client
     * via /app/sendMessage et le rediffuse à tous les abonnés
     * du topic /topic/messages
     */
    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage(ChatMessage message) {
        // Retourner le message pour qu’il soit envoyé à tous les clients connectés
        return message;
    }

    /**
     * Endpoint HTTP qui sert la page du chat
     */
    @GetMapping("/chat")
    public String chat() {
        return "chat"; // correspond à src/main/resources/templates/chat.html (si tu utilises Thymeleaf)
    }
}
