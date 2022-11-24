package com.SmartShopper.SmartShopper.core.entity

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name='user_')
class UserEntity {

    @Id
    Long id

    String fullName
    String first
    String last
    String email

}
