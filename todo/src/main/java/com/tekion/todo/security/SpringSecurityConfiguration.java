package com.tekion.todo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.util.function.Function;

@Configuration
public class SpringSecurityConfiguration {

    @Bean
    public InMemoryUserDetailsManager createUserDetailsManager() {
        UserDetails user1 = createNewUser("Ankit", "123");
        UserDetails user2 = createNewUser("Deepshikha", "123");
        //        UserDetails user = User.withDefaultPasswordEncoder()
        //                .username("Ankit")
        //                .password("123")
        //                .roles("USER", "ADMIN")
        //                .build();

        return new InMemoryUserDetailsManager(user1, user2);

    }

    private UserDetails createNewUser(String username, String password) {
        Function<String, String> passwordEncoder = input -> passwordEncoder().encode(input);

        UserDetails user = User.builder().passwordEncoder(passwordEncoder).username(username).password(password)
                               .roles("USER", "ADMIN").build();
        return user;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
