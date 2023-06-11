package com.example.todo.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "todo", nullable = false)
    private String todo;

    @Column(name = "complete", nullable = false)
    private Boolean complete;

    @Builder
    public Todo(String todo, Boolean complete) {
        this.todo = todo;
        this.complete = complete;
    }
}
