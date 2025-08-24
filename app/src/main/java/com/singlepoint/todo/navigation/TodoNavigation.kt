package com.singlepoint.todo.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.singlepoint.todo.ui.screen.AddTodoScreen
import com.singlepoint.todo.ui.screen.MainScreen
import com.singlepoint.todo.viewmodel.TodoViewModel

@Composable
fun TodoNavigation(
    viewModel: TodoViewModel,
    navController: NavHostController = rememberNavController()
) {
    
    NavHost(
        navController = navController,
        startDestination = "main"
    ) {
        composable("main") {
            MainScreen(
                onAddTodoClick = {
                    navController.navigate("add_todo")
                },
                viewModel = viewModel
            )
        }
        
        composable("add_todo") {
            AddTodoScreen(
                onNavigateBack = {
                    navController.popBackStack()
                },
                viewModel = viewModel
            )
        }
    }
}
