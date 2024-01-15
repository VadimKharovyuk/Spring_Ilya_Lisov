package com.example.spring_ilya_lisov.repository.impl;

import com.example.spring_ilya_lisov.domain.user.Role;
import com.example.spring_ilya_lisov.domain.user.User;
import com.example.spring_ilya_lisov.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public class UserRepositoryImpl implements UserRepository {


    @Override
    public Optional<User> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<User> findByUserName(String userName) {
        return Optional.empty();
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void create(User user) {

    }

    @Override
    public void insertUserRole(Long userId, Role role) {

    }

    @Override
    public boolean isTaskOwner(Long id, Long taskId) {
        return false;
    }

    @Override
    public void delete(Long id) {

    }
}
