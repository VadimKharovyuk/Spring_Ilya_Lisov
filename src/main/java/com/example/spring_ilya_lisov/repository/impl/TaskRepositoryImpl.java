package com.example.spring_ilya_lisov.repository.impl;

import com.example.spring_ilya_lisov.domain.task.Task;
import com.example.spring_ilya_lisov.repository.TaskRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class TaskRepositoryImpl implements TaskRepository {

    @Override
    public Optional<Task> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Task> findByUserId(Long userId) {
        return null;
    }

    @Override
    public void assignUserId(Long taskId, Long userId) {

    }

    @Override
    public void update(Task task) {

    }

    @Override
    public void create(Task task) {

    }

    @Override
    public void delete(Long id) {

    }
}
