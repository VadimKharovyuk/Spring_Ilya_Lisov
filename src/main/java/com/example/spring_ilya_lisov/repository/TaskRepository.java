package com.example.spring_ilya_lisov.repository;

import com.example.spring_ilya_lisov.domain.task.Task;

import java.util.List;
import java.util.Optional;

public interface TaskRepository {
    Optional<Task> findById (Long id);
    List<Task> findByUserId(Long userId);
    void assignUserId(Long taskId,Long userId);
    void update(Task task);
    void create(Task task);
    void delete(Long id) ;
}
