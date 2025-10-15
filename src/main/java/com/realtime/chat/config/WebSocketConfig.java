package com.realtime.chat.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/chat")
                .setAllowedOriginPatterns("*") // ✅ Autorise toutes les origines
                .withSockJS(); // fallback pour navigateurs sans WebSocket natif
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        // ✅ Les messages envoyés à /app/... seront routés vers les méthodes @MessageMapping
        registry.setApplicationDestinationPrefixes("/app");

        // ✅ Le broker interne envoie les messages aux abonnés de /topic
        registry.enableSimpleBroker("/topic");
    }
}
