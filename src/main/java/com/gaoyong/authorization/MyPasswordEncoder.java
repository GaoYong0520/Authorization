package com.gaoyong.authorization;

import org.springframework.security.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Created by jimin on 2017/8/26.
 */
public class MyPasswordEncoder implements PasswordEncoder {

    private final static String SALT = "123456";
    @Override
    public String encode(CharSequence rawPassword) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(SALT);
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.matches(rawPassword.toString(), encodedPassword);
    }
}
