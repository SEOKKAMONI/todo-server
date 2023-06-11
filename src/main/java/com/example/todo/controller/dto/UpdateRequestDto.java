package com.example.todo.controller.dto;

import lombok.Getter;

@Getter
public class UpdateRequestDto {
    private String todo;
    private Boolean complete;
}
