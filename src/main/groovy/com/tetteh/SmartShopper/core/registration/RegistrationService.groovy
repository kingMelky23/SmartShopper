package com.tetteh.SmartShopper.core.registration

import org.springframework.stereotype.Service

@Service
class RegistrationService {

    RegistrationService(){}

    String register(RegistrationRequest request){
        return "works"
    }
}
