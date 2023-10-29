package com.tetteh.SmartShopper.core.registration

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

@EqualsAndHashCode
@ToString
class RegistrationRequest {
    private  final String firstName
    private  final String lastName
    private  final String email
    private  final String password
}
