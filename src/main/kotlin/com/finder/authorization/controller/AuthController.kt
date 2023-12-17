package com.finder.authorization.controller

import com.finder.authorization.controller.AuthController.Companion.FINDER
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/$FINDER/auth")
class AuthController {

//    @GetMapping("/{accountNumber}")
//    fun getToken(@PathVariable accountNumber: String): String {
//
//    }

    companion object {
        const val FINDER = "finder"
    }
}