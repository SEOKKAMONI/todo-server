package com.example.todo.controller;

import com.example.todo.controller.dto.CreateRequestDto;
import com.example.todo.service.TodoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class TodoController {
    private final TodoService todoService;
    @PostMapping("/todo")
    public Long createTodo(@RequestBody CreateRequestDto createRequestDto) {
        return todoService.createTodo(createRequestDto);
    }
}
