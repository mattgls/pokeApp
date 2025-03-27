package com.mgui.pokeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.createGraph
import com.mgui.pokeapp.ui.navigation.BottomNavigationBar
import com.mgui.pokeapp.ui.navigation.Screen
import com.mgui.pokeapp.ui.screens.dex.DexScreen
import com.mgui.pokeapp.ui.screens.map.MapScreen
import com.mgui.pokeapp.ui.screens.feed.FeedScreen
import com.mgui.pokeapp.ui.screens.feed.FeedViewmodel
import com.mgui.pokeapp.ui.theme.PokeAppTheme
import androidx.lifecycle.viewmodel.compose.viewModel
import com.mgui.pokeapp.ui.screens.camera.PhotoScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PokeAppTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    val feedViewmodel: FeedViewmodel = viewModel()
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = { BottomNavigationBar(navController) }
    ) { innerPadding ->

        val graph =
            navController.createGraph(startDestination = Screen.Feed.rout) {
                composable(route = Screen.Feed.rout) {
                    FeedScreen(feedViewmodel, navController)
                }
                composable(route = Screen.Map.rout) {
                    MapScreen(navController)
                }
                composable(route = Screen.Dex.rout) {
                    DexScreen()
                }
                composable(route = Screen.Camera.rout) {
                    PhotoScreen()
                }
            }
        NavHost(
            navController = navController,
            graph = graph,
            modifier = Modifier.padding(innerPadding)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PokeAppTheme {
        MainScreen()
    }
}
