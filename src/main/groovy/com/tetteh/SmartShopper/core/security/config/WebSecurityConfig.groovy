package com.tetteh.SmartShopper.core.security.config

import com.tetteh.SmartShopper.core.users.service.UserService
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.authentication.dao.DaoAuthenticationProvider
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

@Configuration
@EnableWebSecurity
class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    private final UserService userService
    private final BCryptPasswordEncoder bCryptPasswordEncoder

    WebSecurityConfig (
            UserService userService,
            BCryptPasswordEncoder bCryptPasswordEncoder
    ) {
        this.userService = userService
        this.bCryptPasswordEncoder = bCryptPasswordEncoder
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("/api/v*/registration/**")
                .permitAll()
                .anyRequest()
                .authenticated()
                .and().formLogin()

    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(daoAuthenticationProvider())
    }

    @Bean
    DaoAuthenticationProvider daoAuthenticationProvider() {
        DaoAuthenticationProvider provider =
                new DaoAuthenticationProvider()
        provider.setPasswordEncoder(bCryptPasswordEncoder)
        provider.setUserDetailsService(userService)
        return provider
    }
}
