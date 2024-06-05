package com.finder.authorization.message.controller

import org.springframework.web.socket.TextMessage
import org.springframework.web.socket.WebSocketMessage
import org.springframework.web.socket.WebSocketSession
import org.springframework.web.socket.handler.TextWebSocketHandler

class MyWebSocketController : TextWebSocketHandler() {

    override fun handleMessage(session: WebSocketSession, message: WebSocketMessage<*>) {
        val payload = message.payload
        // Обработка полученного сообщения
        println("Получено сообщение: $payload")
        // Отправка ответа
        session.sendMessage(TextMessage("Echo: $payload"))
    }

    override fun afterConnectionEstablished(session: WebSocketSession) {
        // Обработка установления соединения
        println("Новое соединение: ${session.id}")
    }
}