package com.mgui.pokeapp.ui.screens.feed

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mgui.pokeapp.data.Pokemon

@Composable
fun FeedScreen(viewModel: FeedViewmodel) {
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

@Preview
@Composable
fun Preview() {
    val vm = FeedViewmodel()
    FeedScreen(vm)
}
