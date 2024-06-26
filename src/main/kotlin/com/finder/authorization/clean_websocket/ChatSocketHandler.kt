package com.finder.authorization.clean_websocket

import com.finder.authorization.clean_websocket.websocket_proxy.ChatProxyWebsocket
import org.springframework.web.socket.*
import java.io.IOException

class ChatSocketHandler: WebSocketHandler {
    private val sessions = mutableSetOf<WebSocketSession>()
    private val chatProxyWebsocket = ChatProxyWebsocket()

    override fun afterConnectionEstablished(session: WebSocketSession) {
        println("afterConnectionEstablished session = $session")
        sessions.add(session)
//        session.sendMessage(TextMessage(proxyWebsocket.formGetUserId()))
    }

    override fun handleMessage(session: WebSocketSession, message: WebSocketMessage<*>) {
        val messageText = message.payload as String
        println("handleMessage session = $session, message = $messageText")
        broadcastMessage(messageText)
    }

    override fun handleTransportError(session: WebSocketSession, exception: Throwable) {
        println("handleTransportError session = $session")
        sessions.remove(session)
    }

    override fun afterConnectionClosed(session: WebSocketSession, closeStatus: CloseStatus) {
        println("afterConnectionClosed session = $session")
        sessions.remove(session)
    }

    override fun supportsPartialMessages(): Boolean {
        println("supportsPartialMessages")
        return false
    }

    private fun broadcastMessage(message: String) {
        sessions.forEach { session ->
            try {
                session.sendMessage(TextMessage(message))
            } catch (e: IOException) {
                sessions.remove(session)
            }
        }
    }
}