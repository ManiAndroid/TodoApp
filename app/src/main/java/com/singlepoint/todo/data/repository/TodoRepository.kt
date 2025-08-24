package com.singlepoint.todo.data.repository

import com.singlepoint.todo.data.local.Todo
import com.singlepoint.todo.data.local.TodoDao
import kotlinx.coroutines.flow.Flow

class TodoRepository(private val todoDao: TodoDao) {

    fun getAllTodos(): Flow<List<Todo>> = todoDao.getAllTodos()

    suspend fun addTodo(todo: Todo) {
        todoDao.insertTodo(todo)
    }

    suspend fun deleteTodo(todo: Todo) {
        todoDao.deleteTodo(todo)
    }

}
