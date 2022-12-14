package com.example.todo.presentation.home.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.input.KeyboardType

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchView(
    onTextUpdate: (text: String) -> Unit,
    modifier: Modifier = Modifier
) {

    var searchText by rememberSaveable { mutableStateOf("") }

    OutlinedTextField(
        value = searchText,
        onValueChange = {
            searchText = it
            onTextUpdate(it)
        },
        singleLine = true,
        shape = RoundedCornerShape(25),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            containerColor = MaterialTheme.colorScheme.secondaryContainer,
            focusedBorderColor = Color.Transparent,
            unfocusedBorderColor = Color.Transparent,
        ),
        leadingIcon = { Icon(Icons.Default.Search, contentDescription = "Search") },
        placeholder = { Text(text = "Search") },
        modifier = modifier
            .fillMaxWidth(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
    )
}
