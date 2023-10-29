package com.tetteh.SmartShopper.core.entity

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.tetteh.SmartShopper.core.users.model.User
import com.tetteh.SmartShopper.core.users.model.UserRole
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails

import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.SequenceGenerator
import javax.persistence.Table

@Entity
@Table(name = "users_")
@JsonIgnoreProperties(["password"])
class UserEntity implements UserDetails{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = 'user_id_seq') //we use generateType.Identity is for when out DB column used auto increment https://www.youtube.com/watch?v=n_tc6Nc4tfI&ab_channel=JavaGuides
    @SequenceGenerator(name = 'user_id_seq', sequenceName = 'user_id_seq', allocationSize = 1)
    Integer id

    private String first
    private String last
    private String email
    private String password
    @Enumerated(EnumType.STRING)
    private UserRole userRole
    private Boolean locked
    private Boolean enabled



    User toResponseModel() {
        new User(
                id: id,
                first: first,
                last: last,
                email: email
        )
    }

    @Override
    Collection<? extends GrantedAuthority> getAuthorities() {
        SimpleGrantedAuthority authority = new SimpleGrantedAuthority(userRole.name())
        return Collections.singletonList(authority)
    }

    @Override
    String getPassword() {
        return password
    }

    @Override
    String getUsername() {
        return username
    }

    @Override
    boolean isAccountNonExpired() {
        return true
    }

    @Override
    boolean isAccountNonLocked() {
        return !locked
    }

    @Override
    boolean isCredentialsNonExpired() {
        return true
    }

    @Override
    boolean isEnabled() {
        return enabled
    }
}
