package com.finder.authorization.message.model

import java.util.*

data class ChatMessage(
    val id: String? = null,
    val chatId: String? = null,
    val senderId: String? = null,
    val recipientId: String? = null,
    val senderName: String? = null,
    val recipientName: String? = null,
//    val content: String? = null,
//    val timestamp: Date? = null,
//    val status: MessageStatus? = null,
)

enum class MessageStatus {
    RECEIVED, DELIVERED
}

data class ChatNotification (
    val id: String? = null,
    val senderId: String? = null,
    val senderName: String? = null,
)