package com.example.todo.domian.model

import java.time.LocalDateTime

data class ToDoStep(
    val id: String = "",
    val name: String = "",
    val status: ToDoStatus = ToDoStatus.IN_PROGRESS,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime,
)
