package com.singlepoint.todo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.singlepoint.todo.navigation.TodoNavigation
import com.singlepoint.todo.ui.theme.ComposeUITheme
import com.singlepoint.todo.viewmodel.TodoViewModel
import com.singlepoint.todo.viewmodel.TodoViewModelFactory

class MainActivity : ComponentActivity() {

    private val viewModel: TodoViewModel by viewModels {
        TodoViewModelFactory(TodoApplication.appModule.todoRepository)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeUITheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TodoNavigation(viewModel)
                }
            }
        }
    }
}