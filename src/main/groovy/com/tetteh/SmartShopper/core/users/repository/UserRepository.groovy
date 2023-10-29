package com.tetteh.SmartShopper.core.users.repository

import com.tetteh.SmartShopper.core.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional


@Repository
@Transactional(readOnly = true)
interface UserRepository extends JpaRepository<UserEntity,Integer>{
    Optional<UserEntity> findByEmail(String email)
}