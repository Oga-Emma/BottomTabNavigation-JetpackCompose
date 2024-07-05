package com.dawinder.btnjc.ui.composables

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.dawinder.btnjc.nav.Item

/**
 * Composable function that defines the navigation screens and their corresponding destinations.
 *
 * @param navController The navigation controller used for handling navigation between screens.
 */
@Composable
fun NavigationScreens(navController: NavHostController, navItems: List<Item>) {
    NavHost(navController, startDestination = navItems.first().path) {
        navItems.map {
            composable(route = it.path, content = it.screen)
        }
    }
}