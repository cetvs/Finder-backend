package com.finder.authorization.message.controller

import org.springframework.web.socket.TextMessage
import org.springframework.web.socket.WebSocketMessage
import org.springframework.web.socket.WebSocketSession
import org.springframework.web.socket.handler.TextWebSocketHandler

class MyWebSocketController : TextWebSocketHandler() {

    override fun handleMessage(session: WebSocketSession, message: WebSocketMessage<*>) {
        val payload = message.payload
        // ��������� ����������� ���������
        println("�������� ���������: $payload")
        // �������� ������
        session.sendMessage(TextMessage("Echo: $payload"))
    }

    override fun afterConnectionEstablished(session: WebSocketSession) {
        // ��������� ������������ ����������
        println("����� ����������: ${session.id}")
    }
}