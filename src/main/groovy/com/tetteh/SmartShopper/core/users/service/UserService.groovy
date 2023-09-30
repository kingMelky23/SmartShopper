package com.tetteh.SmartShopper.core.users.service

import com.tetteh.SmartShopper.core.entity.UserEntity
import com.tetteh.SmartShopper.core.users.model.User
import com.tetteh.SmartShopper.core.users.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

import javax.transaction.Transactional

@Service
class UserService {

    private final UserRepository usersRepository

    @Autowired
    UserService(UserRepository usersRepository) {
        this.usersRepository = usersRepository
    }

    @Transactional
    User getUserById(int uid){
        return usersRepository.getReferenceById(uid).toResponseModel()
    }


    UserEntity addNewUser(User user){
        return usersRepository.save(
                new UserEntity(
                        email: user.email,
                        first: user.first,
                        last: user.last
                )
        )
    }
}
