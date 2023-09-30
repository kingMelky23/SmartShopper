package com.tetteh.SmartShopper.core.users.api

import com.tetteh.SmartShopper.core.entity.UserEntity
import com.tetteh.SmartShopper.core.users.model.User
import com.tetteh.SmartShopper.core.users.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {

    private final UserService userService

    @Autowired
    UserController(UserService userService) {
        this.userService = userService
    }

    @GetMapping(value = '/user')
    User getUser(@RequestParam int uid){
        return userService.getUserById(uid)
    }

    @PostMapping(value = '/user/create', produces = MediaType.APPLICATION_JSON_VALUE)
    UserEntity createUser(@RequestBody User user) {
        userService.addNewUser(user)
    }



}
