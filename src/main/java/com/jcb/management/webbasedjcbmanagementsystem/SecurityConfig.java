package com.jcb.management.webbasedjcbmanagementsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) //  For API Requests CSRF Disable 
                .authorizeHttpRequests(auth -> auth.anyRequest().permitAll()); // Give the All Pages  Direct Access 

        return http.build();
    }
}
