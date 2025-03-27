package com.mgui.pokeapp.data

import android.graphics.Bitmap

interface PokemonClassifier {
    fun classify(bitmap: Bitmap, rotation: Int): List<Pokemon>
}