package com.example.spring_ilya_lisov.web.dto.aut;

import lombok.Data;

@Data
public class JwtResponse {
    private Long id;
    private String username;
    private String accesToket;
    private String refreshToken;
}
