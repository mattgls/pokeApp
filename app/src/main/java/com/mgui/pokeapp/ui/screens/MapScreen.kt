package com.mgui.pokeapp.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MapScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Map Screen",
            style = MaterialTheme.typography.headlineLarge
        )
    }
    //FIXME Implement the map here
    Box(
        modifier = Modifier
            .fillMaxSize().padding(16.dp),
        contentAlignment = Alignment.BottomEnd,
    ) {
        FloatingActionButton(
            //FIXME Implement the click to redirect to the custom Camera view
            onClick = { /*onClick()*/ }
        ) {
            Icon(Icons.Default.Add, "Floating action button.")
        }
    }
}