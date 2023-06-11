package com.example.todo.service;

import com.example.todo.controller.dto.CreateRequestDto;
import com.example.todo.controller.dto.TodoResponseDto;
import com.example.todo.controller.dto.UpdateRequestDto;
import com.example.todo.domain.Todo;
import com.example.todo.repository.TodoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

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

    @Transactional
    public TodoResponseDto updateTodo(UpdateRequestDto updateRequestDto, Long id) {
        Todo todo = todoRepository.findById(id).orElseThrow(IllegalAccessError::new);
        todo.UpdateTodo(updateRequestDto);
        return new TodoResponseDto(todo);
    }

    public List<TodoResponseDto> getTodo() {
        List<Todo> todo = todoRepository.findAll();
        List<TodoResponseDto> result = new ArrayList<>();
        for(Todo t: todo) {
            result.add(new TodoResponseDto(t));
        }
        return result;
    }
    @Transactional
    public TodoResponseDto updateCompleteTodo(Long id) {
        Todo todo = todoRepository.findById(id).orElseThrow(IllegalAccessError::new);
        todo.UpdateCompleteTodo();
        return new TodoResponseDto(todo);
    }
}
