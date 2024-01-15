package com.example.spring_ilya_lisov.web.mappers;

import com.example.spring_ilya_lisov.domain.task.Task;
import com.example.spring_ilya_lisov.web.dto.task.TaskDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskMapper {
    TaskDto toDto (Task task);
    List<TaskDto> toDto(List<Task> tasks);
    Task toEntity(TaskDto dto);
}
