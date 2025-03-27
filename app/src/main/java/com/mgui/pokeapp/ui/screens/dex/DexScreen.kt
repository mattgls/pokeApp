package com.mgui.pokeapp.ui.screens.dex

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DexScreen() {
    Box(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        //FIXME - We can use the https://pokeapi.co/ REST API to do so
        Text(
            modifier = Modifier.align(Alignment.Center),
            text = "Dex Screen - Here implement the pokedex",
            style = MaterialTheme.typography.headlineLarge
        )
    }
}