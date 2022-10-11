package com.example.todo.presentation.home

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.todo.presentation.home.components.HomeContent
import com.example.todo.presentation.navigation.Screens

private const val TAG = "HomeRoute"

@Composable
fun HomeScreen(
    controller: NavHostController,
    viewModel: HomeViewModel = hiltViewModel()
) {
    val lists by viewModel.toDoListFlow.collectAsState(initial = emptyList())

    HomeContent(
        lists = lists,
        onDrawerClicked = {},
        onAddListClicked = { toDoList ->
            viewModel.addToDoList(toDoList)
        },
        onListItemClick = {
            controller.navigate(Screens.ListScreen.navRuteWithArgument(it))
        },
        onDeleteListItemClick = {
            viewModel.deleteToDoList(it)
        },
        onSearchClick = {}
    )
}


