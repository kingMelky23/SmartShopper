package com.SmartShopper.SmartShopper.core.user.api

import org.springframework.web.bind.annotation.GetMapping

import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {

    @GetMapping('/user')
    String helloWorld() {
        return "hello world"
    }
}
