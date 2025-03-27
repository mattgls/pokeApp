package com.mgui.pokeapp.ui.screens.feed

import androidx.lifecycle.ViewModel
import com.mgui.pokeapp.data.Pokemon
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlin.random.Random

class FeedViewmodel : ViewModel() {
    private val _pokemons = MutableStateFlow<List<Pokemon>>(emptyList())
    val pokemons: StateFlow<List<Pokemon>> = _pokemons

    init {
        loadPokemons()
    }

    private fun loadPokemons() {
        // Test batch
        _pokemons.value = List(20) { index ->
            Pokemon(
                name = "Pokemon #$index",
                score = Random.nextFloat()
            )
        }
    }
}