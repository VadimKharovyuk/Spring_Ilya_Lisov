package com.example.spring_ilya_lisov.web.controller;

import com.example.spring_ilya_lisov.domain.task.Task;
import com.example.spring_ilya_lisov.service.TaskService;
import com.example.spring_ilya_lisov.web.dto.task.TaskDto;
import com.example.spring_ilya_lisov.web.dto.walidation.OnUpdate;
import com.example.spring_ilya_lisov.web.mappers.TaskMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/tasks")
@RequiredArgsConstructor
@Validated
public class TaskController {

    private final TaskService taskService ;
    private final TaskMapper taskMapper ;
    @PutMapping
    public TaskDto update(@Validated(OnUpdate.class)@RequestBody TaskDto dto){
     Task task = taskMapper.toEntity(dto);
     Task  updateTask = taskService.update(task);
     return taskMapper.toDto(updateTask);
    }
    @GetMapping("/{id}")
    public TaskDto getById(@PathVariable Long id){
        Task task = taskService.getById(id);
        return taskMapper.toDto(task);
    }
    @DeleteMapping("/{id}")
    public void  deleteById(@PathVariable Long id){
        taskService.delete(id);
    }
}
