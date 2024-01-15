package com.example.spring_ilya_lisov.service.impl;

import com.example.spring_ilya_lisov.domain.user.User;
import com.example.spring_ilya_lisov.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getBuId(Long id) {
        return null;
    }

    @Override
    public User getByUserName(String userName) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public boolean isTaskOwner(Long userId, Long taskId) {
        return false;
    }

    @Override
    public void delete(Long id) {

    }
}
