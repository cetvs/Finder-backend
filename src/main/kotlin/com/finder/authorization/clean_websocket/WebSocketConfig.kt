package com.finder.authorization.clean_websocket

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.socket.WebSocketHandler
import org.springframework.web.socket.config.annotation.EnableWebSocket
import org.springframework.web.socket.config.annotation.WebSocketConfigurer
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry


@Configuration
@EnableWebSocket
class WebSocketConfig : WebSocketConfigurer {
    @Bean
    fun webSocketHandler(): WebSocketHandler {
        return CustomWebSocketHandler()
    }

    override fun registerWebSocketHandlers(registry: WebSocketHandlerRegistry) {
        registry.addHandler(webSocketHandler(), "/ws_chat") // Определяем путь сокетов для чата
    }
}