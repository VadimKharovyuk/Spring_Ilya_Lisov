package com.example.spring_ilya_lisov.repository;

import com.example.spring_ilya_lisov.domain.user.Role;
import com.example.spring_ilya_lisov.domain.user.User;

import java.util.Optional;

public interface UserRepository {
    Optional<User> findById(Long id) ;
    Optional<User> findByUserName(String userName) ;
    void update(User user);
    void create(User user);
    void insertUserRole(Long userId, Role role);
    boolean isTaskOwner(Long id, Long taskId);
    void  delete(Long id);
}
