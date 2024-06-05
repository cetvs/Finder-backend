package com.finder.authorization.chat

import com.finder.authorization.message.model.ChatMessage
import org.springframework.stereotype.Service

@Service
class ChatMessageService {

    fun save(chatMessage: ChatMessage): ChatMessage {
        println("ChatMessageService save")
        return ChatMessage("1", "1", "2")
    }
}