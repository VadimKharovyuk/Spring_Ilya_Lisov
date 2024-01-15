package com.example.spring_ilya_lisov.web.dto.task;

import com.example.spring_ilya_lisov.domain.task.Status;
import com.example.spring_ilya_lisov.web.dto.walidation.OnCreate;
import com.example.spring_ilya_lisov.web.dto.walidation.OnUpdate;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
@Data
public class TaskDto {
    @NotNull(message = "Id  не должно быть пустым",groups = OnUpdate.class)
    private Long id;

    @NotNull(message = "Title mast me  not null",groups = {OnUpdate.class, OnCreate.class})
    @Length(max = 255,message = "title не должна превышать 255 символов",groups = {OnCreate.class, OnUpdate.class})
    private String title;
    @Length(max = 255,message = " описание  не должно превышать 255 символов",groups = {OnCreate.class, OnUpdate.class})
    private String description;


    private Status status ;
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    @JsonFormat(pattern = "yyyy-MM-dd-HH:mm")
    private LocalDateTime expirationDate ;
}


