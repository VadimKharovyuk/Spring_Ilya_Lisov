package com.example.spring_ilya_lisov.web.controller;

import com.example.spring_ilya_lisov.domain.task.Task;
import com.example.spring_ilya_lisov.domain.user.User;
import com.example.spring_ilya_lisov.service.TaskService;
import com.example.spring_ilya_lisov.service.UserService;
import com.example.spring_ilya_lisov.web.dto.task.TaskDto;
import com.example.spring_ilya_lisov.web.dto.user.UserDto;
import com.example.spring_ilya_lisov.web.dto.walidation.OnCreate;
import com.example.spring_ilya_lisov.web.dto.walidation.OnUpdate;
import com.example.spring_ilya_lisov.web.mappers.TaskMapper;
import com.example.spring_ilya_lisov.web.mappers.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
@Validated
public class UserController {
    private final UserService userService ;
    private final TaskService taskService ;
    private final UserMapper userMapper ;
    private final TaskMapper taskMapper ;
    @PutMapping
    public UserDto update(@Validated (OnUpdate.class)@RequestBody UserDto Dto){
        User user = userMapper.toEntity(Dto);
        User upadteUser= userService.update(user);
        return userMapper.toDto(upadteUser);

    }
    @GetMapping("{id}")
    public UserDto getById(@PathVariable Long id){
        User user = userService.getBuId(id);
        return userMapper.toDto(user);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        userService.getBuId(id);
    }
    @GetMapping("/{id}/tasks")
    public List<TaskDto>  getTaskByUserID(@PathVariable Long id){
        List<Task> tasks =taskService.getAllByUserId(id);
        return taskMapper.toDto(tasks);
    }
    @PostMapping("/{id}/tasks")
    public TaskDto createTask (@PathVariable Long id,
                               @Validated (OnCreate.class)
                               @RequestBody TaskDto dto){
        Task task = taskMapper.toEntity(dto);
        Task createTask = taskService.create(task,id);
        return taskMapper.toDto(createTask);

    }
}
