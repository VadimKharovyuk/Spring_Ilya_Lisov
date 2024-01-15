package com.example.spring_ilya_lisov.domain.user;

import com.example.spring_ilya_lisov.domain.task.Task;
import lombok.Data;


import java.util.List;
import java.util.Set;

@Data
public class User {
    private Long id;
    private String name ;
    private String userName;
    private String password;
    private String passwordConfiguration;
    private Set<Role> roles ;
    private List<Task> tasks;
}
