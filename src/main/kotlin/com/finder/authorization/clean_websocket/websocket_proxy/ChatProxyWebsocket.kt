package com.finder.authorization.clean_websocket.websocket_proxy

class ChatProxyWebsocket {

    fun formGetUserId(): String {
        return CHAT_GET_USER_ID
    }

    fun formMessageUrl(MessageText: String): String {
        return CHAT_MESSAGE + MessageText
    }

    companion object {
        private const val CHAT_MESSAGE = "/chat/message\n"
        private const val CHAT_GET_USER_ID = "/chat/get/user\n"
    }
}