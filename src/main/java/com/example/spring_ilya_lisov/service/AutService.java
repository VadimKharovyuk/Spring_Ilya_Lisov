package com.example.spring_ilya_lisov.service;

import com.example.spring_ilya_lisov.web.dto.aut.JwtRequest;
import com.example.spring_ilya_lisov.web.dto.aut.JwtResponse;

public interface AutService {
   JwtResponse login(JwtRequest loginRequest);
    JwtResponse refresh(String refreshToken) ;
}
