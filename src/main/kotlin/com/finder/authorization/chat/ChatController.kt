package com.finder.authorization.chat

import com.finder.authorization.message.model.ChatMessage
import com.finder.authorization.message.model.ChatNotification
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.Payload
import org.springframework.messaging.simp.SimpMessagingTemplate
import org.springframework.stereotype.Controller


@Controller
class ChatController {
    @Autowired
    private lateinit var messagingTemplate: SimpMessagingTemplate

    @Autowired
    private lateinit var chatMessageService: ChatMessageService

    @MessageMapping("/chat")
    fun processMessage(@Payload chatMessage: ChatMessage) {

        println("Chat processMessage")
        val saved: ChatMessage = chatMessageService.save(chatMessage)
        messagingTemplate.convertAndSendToUser(
            chatMessage.recipientId ?: "",
            "/queue/messages",
            ChatNotification(
                saved.id,
                saved.senderId,
                saved.senderName
            )
        )
    }
}