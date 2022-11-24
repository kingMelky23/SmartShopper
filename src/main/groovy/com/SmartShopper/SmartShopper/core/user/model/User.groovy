package com.SmartShopper.SmartShopper.core.user.model

import groovy.transform.EqualsAndHashCode

@EqualsAndHashCode
class User {
    Long id
    String first
    String Last
    String email

    String getFullName() {
        "$first $last"
    }

}
