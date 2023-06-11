package com.example.todo.controller.dto;

import lombok.Getter;

@Getter
public class CreateRequestDto {
    private String todo;
    private Boolean complete;
}
