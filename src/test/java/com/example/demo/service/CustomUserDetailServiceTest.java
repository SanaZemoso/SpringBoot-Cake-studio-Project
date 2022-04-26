package com.example.demo.service;

import com.example.demo.model.CustomUserDetail;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

class CustomUserDetailServiceTest
{
    @Mock
    private UserRepository userRepository;

   private CustomUserDetailService customUserDetailService;

    @BeforeEach
    void setUp()
    {
        this.customUserDetailService = new CustomUserDetailService(userRepository);
    }

    @Test
    void loadUserByUsername()
    {
    }
}