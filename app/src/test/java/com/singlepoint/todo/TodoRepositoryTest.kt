package com.singlepoint.todo

import com.singlepoint.todo.data.local.Todo
import com.singlepoint.todo.data.local.TodoDao
import com.singlepoint.todo.data.repository.TodoRepository
import io.mockk.coVerify
import io.mockk.every
import io.mockk.mockk
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.test.runTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test


@OptIn(ExperimentalCoroutinesApi::class)
class TodoRepositoryTest {

    private lateinit var todoDao: TodoDao
    private lateinit var repository: TodoRepository

    @BeforeEach
    fun setup() {
        todoDao = mockk(relaxed = true) // relaxed = auto returns Unit for suspend
        repository = TodoRepository(todoDao)
    }

    @Test
    fun testGetAllTodos() = runTest {
        val sampleTodos = listOf(
            Todo(id = 1, title = "Test 1"),
            Todo(id = 2, title = "Test 2")
        )

        every { todoDao.getAllTodos() } returns flowOf(sampleTodos)

        val result = repository.getAllTodos()
        val collected = result.first()
        assertEquals(2, collected.size)
        assertEquals("Test 1", collected[0].title)
    }

    @Test
    fun testAddTodo() = runTest {
        val todo = Todo(title = "New Task")

        repository.addTodo(todo)

        coVerify { todoDao.insertTodo(todo) }
    }

    @Test
    fun testDeleteTodo() = runTest {
        val todo = Todo(id = 5, title = "Delete Me")

        repository.deleteTodo(todo)

        coVerify { todoDao.deleteTodo(todo) }
    }
}