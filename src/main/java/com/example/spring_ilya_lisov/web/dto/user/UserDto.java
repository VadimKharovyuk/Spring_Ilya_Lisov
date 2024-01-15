package com.example.spring_ilya_lisov.web.dto.user;

import com.example.spring_ilya_lisov.domain.task.Task;
import com.example.spring_ilya_lisov.domain.user.Role;
import com.example.spring_ilya_lisov.web.dto.walidation.OnCreate;
import com.example.spring_ilya_lisov.web.dto.walidation.OnUpdate;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.List;
import java.util.Set;

@Data
public class UserDto {
    @NotNull(message = "Id  не должно быть пустым",groups = OnUpdate.class)
    private Long id;

    @NotNull(message = "Имя  не  должно быть пустым",groups = {OnCreate.class,OnUpdate.class})
    @Length(min = 255,message = "длинна имени не  должна  превышать 255 символов",groups = {OnCreate.class,OnUpdate.class})
    private String name ;


    @NotNull(message = "Имя  не  должно быть пустым",groups = {OnCreate.class,OnUpdate.class})
    @Length(min = 255,message = "длинна фамилии не  должна  превышать 255 символов",groups = {OnCreate.class,OnUpdate.class})
    private String userName;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @NotNull(message = "пароль не  должен быть пустым",groups = {OnCreate.class,OnUpdate.class })
    private String password;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @NotNull(message = "пароль не  должен быть пустым",groups = OnCreate.class)
    private String passwordConfiguration;

}
