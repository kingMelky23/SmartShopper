package com.tetteh.SmartShopper.core.registration

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(path = "api/v1/registration")
class RegistrationController {

    RegistrationService registrationService

    @Autowired
    RegistrationController(
            RegistrationService registrationService
    ) {
        this.registrationService = registrationService
    }

    String register(@RequestBody RegistrationRequest request){
        return registrationService.register(request)
    }
}
