package com.tetteh.SmartShopper.core.users.repository

import com.tetteh.SmartShopper.core.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository extends JpaRepository<UserEntity,Integer>{

}