package com.etech.Census.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http
            .csrf(csrf -> csrf.disable())  // disable csrf for now
            .authorizeHttpRequests(auth -> auth
                    .requestMatchers("/", "/anganwadi-login", "/new-registration", "/register/new",
                    		"/successfuladminlogin",
                            "/aww-profile", "/register/new/user",
                    		"/admin-login","/admin-register","/register/new/admin", "/css/**").permitAll()
                .anyRequest().authenticated()
            )
            .formLogin(form -> form
                .loginPage("/anganwadi-login")   // custom login page
                .loginProcessingUrl("/login")  // form submits here
                .defaultSuccessUrl("/aww-profile", true) // success redirect
                .permitAll()
            )
            .logout(logout -> logout
                .logoutUrl("/logout")
                .logoutSuccessUrl("/anganwadi-login?logout")
                .permitAll()
            );

        return http.build();
    }
}