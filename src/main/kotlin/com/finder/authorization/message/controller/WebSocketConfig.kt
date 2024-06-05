package com.finder.authorization.message.controller

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id
import org.springframework.context.annotation.Configuration
import org.springframework.web.socket.config.annotation.EnableWebSocket
import org.springframework.web.socket.config.annotation.WebSocketConfigurer
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry


class WebSocketConfig {
    @Configuration
    @EnableWebSocket
    class WebSocketConfig : WebSocketConfigurer {

        override fun registerWebSocketHandlers(registry: WebSocketHandlerRegistry) {
            registry.addHandler(MyWebSocketController(), "/ws")
                .setAllowedOrigins("*")
        }
    }
}
