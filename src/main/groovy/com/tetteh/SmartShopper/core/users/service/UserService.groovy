package com.tetteh.SmartShopper.core.users.service

import com.tetteh.SmartShopper.core.entity.UserEntity
import com.tetteh.SmartShopper.core.users.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service

import javax.transaction.Transactional

/**
 * Users need the ability to Login with username and password
 *
 * what are the inputs?
 *  Can should users use a username or an email? is there any character constants? how long can an email be
 *  what is an invalid password? null, less than 5 char, username and pass can not be the same
 * */

@Service
class UserService implements UserDetailsService {

    private final static String USER_NOT_FOUND_MESSAGE = "user with email %s not found"

    private final UserRepository usersRepository

    @Autowired
    UserService(UserRepository usersRepository) {
        this.usersRepository = usersRepository
    }

    @Transactional
    UserEntity getUserById(int uid){
        return usersRepository.getReferenceById(uid)
    }


//    UserEntity addNewUser(User user){
//        return usersRepository.save(
//                new UserEntity(
//                        email: user.email,
//                        first: user.first,
//                        last: user.last,
//
//                )
//        )
//    }

    @Override
    UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        return usersRepository.findByEmail(email)
                .orElseThrow(() ->
                        new UsernameNotFoundException(
                                String.format(USER_NOT_FOUND_MESSAGE,email)))
    }
}
