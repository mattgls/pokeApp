package com.mgui.pokeapp.ui.screens.feed

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mgui.pokeapp.data.Pokemon

@Composable
fun FeedScreen(viewModel: FeedViewmodel = FeedViewmodel()) {
    val pokemons = remember { viewModel.pokemons.value }
    LazyColumn(
        modifier = Modifier
            .wrapContentSize(unbounded = false)
            .fillMaxSize()
    ) {
        items(pokemons) { poke ->
            PokemonItem(poke)
        }
    }
}

@Composable
fun PokemonItem(pokemon: Pokemon) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = pokemon.name)
        }
    }
}


