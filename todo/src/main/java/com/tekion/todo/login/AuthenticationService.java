package com.tekion.todo.login;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class AuthenticationService {
    public boolean authenticate(String username, String password) {
        return username.equals("Ankit") && password.equals("123");
    }
}
