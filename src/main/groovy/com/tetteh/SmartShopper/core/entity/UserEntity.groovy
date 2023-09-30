package com.tetteh.SmartShopper.core.entity

import com.tetteh.SmartShopper.core.users.model.User

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "users_")
class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //we use generateType.Identity is for when out DB column used auto increment https://www.youtube.com/watch?v=n_tc6Nc4tfI&ab_channel=JavaGuides
    Integer id

    String first
    String last
    String email

    User toResponseModel() {
        new User(
                id: id,
                first: first,
                last: last,
                email: email
        )
    }
}
