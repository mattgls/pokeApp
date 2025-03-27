package com.mgui.pokeapp.ui.navigation

sealed class Screen(val rout: String) {
    object Feed: Screen("feed_screen")
    object Map: Screen("map_screen")
    object Dex: Screen("dex_screen")
}