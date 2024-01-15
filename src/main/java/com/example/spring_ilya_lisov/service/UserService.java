package com.example.spring_ilya_lisov.service;

import com.example.spring_ilya_lisov.domain.user.User;

public interface UserService {
    User getBuId(Long id) ;
    User getByUserName(String userName);
    User update(User user);
    User create(User user);
    boolean isTaskOwner(Long userId,Long taskId);
    void  delete(Long id);
}
