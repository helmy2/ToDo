package com.example.todo.data.datasource.local


import com.example.todo.data.datasource.local.model.ToDoListDb
import com.example.todo.data.datasource.local.model.ToDoTaskDb
import com.example.todo.domian.model.ToDoList
import com.example.todo.domian.model.ToDoTask
import kotlinx.coroutines.flow.Flow

interface LocalManager {
    suspend fun insertList(data: ToDoListDb)
    fun getLists(): Flow<List<ToDoList>>
    fun getListById(id: String): Flow<ToDoList>
    suspend fun deleteList(listId: String)
    suspend fun updateList(data: ToDoListDb)
    suspend fun insertTask(toDoTaskDb: ToDoTaskDb)
    suspend fun deleteTask(id: String)
    suspend fun updateTask(task: ToDoTaskDb)

    fun getAllTasks(): Flow<List<ToDoList>>
    fun search(value: String): Flow<List<ToDoList>>

}

