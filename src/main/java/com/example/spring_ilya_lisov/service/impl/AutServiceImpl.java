package com.example.spring_ilya_lisov.service.impl;

import com.example.spring_ilya_lisov.service.AutService;
import com.example.spring_ilya_lisov.web.dto.aut.JwtRequest;
import com.example.spring_ilya_lisov.web.dto.aut.JwtResponse;
import org.springframework.stereotype.Service;

@Service
public class AutServiceImpl implements AutService {
    @Override
    public JwtResponse login(JwtRequest loginRequest) {
        return null;
    }

    @Override
    public JwtResponse refresh(String refreshToken) {
        return null;
    }
}
