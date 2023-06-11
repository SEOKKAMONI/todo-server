package com.example.todo.controller.dto;

import com.example.todo.domain.Todo;
import lombok.Getter;

@Getter
public class TodoResponseDto {
    private Long id;
    private String todo;
    private Boolean complete;
    public TodoResponseDto(Todo todo) {
        this.id = todo.getId();
        this.todo = todo.getTodo();
        this.complete = todo.getComplete();
    }
}
