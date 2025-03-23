package com.security.authentication_service.service;

import com.security.authentication_service.model.Users;
import com.security.authentication_service.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(5);

    public Users registerUser(Users user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }
}
