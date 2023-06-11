package com.example.todo.service;

import com.example.todo.controller.dto.CreateRequestDto;
import com.example.todo.domain.Todo;
import com.example.todo.repository.TodoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@AllArgsConstructor
public class TodoService {

    private final TodoRepository todoRepository;
    @Transactional
    public Long createTodo(CreateRequestDto createRequestDto) {
        Todo todo = Todo.builder()
                .todo(createRequestDto.getTodo())
                .complete(false)
                .build();
        return todoRepository.save(todo).getId();
    }
}
