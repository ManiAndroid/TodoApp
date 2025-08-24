package com.singlepoint.todo.di

import android.content.Context
import androidx.room.Room
import com.singlepoint.todo.data.local.TodoDatabase
import com.singlepoint.todo.data.repository.TodoRepository

interface AppModule {
    val todoDatabase: TodoDatabase
    val todoRepository: TodoRepository
}

class AppModuleImpl(private val appContext: Context) : AppModule {

    override val todoDatabase: TodoDatabase by lazy {
        Room.databaseBuilder(
            appContext,
            TodoDatabase::class.java,
            "todo_database"
        ).build()
    }

    override val todoRepository: TodoRepository by lazy {
        TodoRepository(todoDatabase.todoDao())
    }
}
