package com.example.spring_ilya_lisov.web.dto.aut;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class JwtRequest {
     @NotNull(message = "user name must be  not null")
     private String username;
     @NotNull(message = "password must be not null")
     private String password ;
}
