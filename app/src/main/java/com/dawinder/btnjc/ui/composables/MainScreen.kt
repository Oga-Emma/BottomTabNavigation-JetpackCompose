package com.dawinder.btnjc.ui.composables

import android.annotation.SuppressLint
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.dawinder.btnjc.nav.NavItem

/**
 * Composable function that represents the main screen of the application.
 *
 * @param navController The navigation controller used for handling navigation between screens.
 */
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen(navController: NavHostController) {

    val navItems = listOf(NavItem.Home, NavItem.Search, NavItem.List, NavItem.Profile)

    Scaffold(
        bottomBar = {
            BottomAppBar {
                BottomNavigationBar(
                    navController = navController,
                    navItems = navItems
                )
            }
        }
    ) {
        NavigationScreens(
            navController = navController,
            navItems = navItems
        )
    }
}