package com.example.spring_ilya_lisov.service;

import com.example.spring_ilya_lisov.domain.task.Task;

import java.util.List;

public interface TaskService {
    Task getById(Long id);
    List<Task> getAllByUserId(Long id);
    Task update( Task task);
    Task create(Task task, Long id);
    void  delete(Long id);
}
