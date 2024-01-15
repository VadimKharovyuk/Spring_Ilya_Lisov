package com.example.spring_ilya_lisov.web.mappers;

import com.example.spring_ilya_lisov.domain.user.User;
import com.example.spring_ilya_lisov.web.dto.user.UserDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto (User user);
    User toEntity(UserDto dto);
}
