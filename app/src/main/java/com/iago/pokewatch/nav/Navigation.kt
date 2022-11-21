package com.iago.pokewatch.nav

import androidx.compose.runtime.Composable
import androidx.wear.compose.navigation.SwipeDismissableNavHost
import androidx.wear.compose.navigation.composable
import androidx.wear.compose.navigation.rememberSwipeDismissableNavController
import com.iago.pokewatch.screens.home.HomeScreen


@Composable
fun Navigation() {
    val navController = rememberSwipeDismissableNavController()

    SwipeDismissableNavHost(
        navController = navController,
        startDestination = Screens.HomeScreen.name,
    ) {
        composable(Screens.HomeScreen.name) {
            HomeScreen()
        }
    }
}