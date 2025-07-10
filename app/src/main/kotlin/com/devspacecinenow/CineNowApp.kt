package com.devspacecinenow

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun CineNowApp(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "movieList"){
        composable(route = "movieList"){
            MovieListScreen(navController)
        }
        composable(route = "movieDetail"){
            MovieDetailScreen()

        }
    }
}