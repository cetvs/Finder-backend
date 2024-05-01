package com.finder.authorization.controller

import com.finder.authorization.controller.AuthController.Companion.FINDER
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/$FINDER/v1/auth")
class AuthController {

    val logger = LoggerFactory.getLogger("package.ClassName")

    @PostMapping("/register")
    fun registerUser(phoneNumber: String) {
        logger.info("Return registerUser = $phoneNumber")
    }

//    @GetMapping("/{accountNumber}")
//    fun getToken(@PathVariable accountNumber: String): String {
//
//    }

    companion object {
        const val FINDER = "finder"
    }
}