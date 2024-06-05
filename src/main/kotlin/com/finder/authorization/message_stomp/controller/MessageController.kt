package com.finder.authorization.message_stomp.controller

import com.finder.authorization.message_stomp.entity.Message
import org.slf4j.LoggerFactory
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.SendTo
import org.springframework.stereotype.Controller

//@Controller
//class MessageController {
//
//    val logger = LoggerFactory.getLogger("package.ClassName")
//
//    @MessageMapping("/hello")
//    @SendTo("/topic/greetings")
//    fun message(message: Message) {
//        logger.info("Return message = $message")
//        println("Получено сообщение: $message")
//    }
//
//    companion object {
//        const val FINDER = "finder"
//    }
//}