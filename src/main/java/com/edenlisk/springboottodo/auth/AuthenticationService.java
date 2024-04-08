package com.edenlisk.springboottodo.auth;

import org.springframework.stereotype.Component;

@Component
public class AuthenticationService {
    public boolean auth(String email, String password) {
        var isEmailValid = email.equalsIgnoreCase("test@gmail.com");
        var isPasswordValid = password.equalsIgnoreCase("dummy");
        return isEmailValid && isPasswordValid;
    }
}
