package com.dawinder.btnjc.nav

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import com.dawinder.btnjc.ui.composables.tabs.HomeScreen
import com.dawinder.btnjc.ui.composables.tabs.ListScreen
import com.dawinder.btnjc.ui.composables.tabs.ProfileScreen
import com.dawinder.btnjc.ui.composables.tabs.SearchScreen

sealed class NavItem {
    object Home : Item(
        path = NavPath.HOME.toString(),
        title = NavTitle.HOME,
        icon = Icons.Default.Home,
        screen = { HomeScreen() }
    )

    object Search : Item(
        path = NavPath.SEARCH.toString(),
        title = NavTitle.SEARCH,
        icon = Icons.Default.Search,
        screen = { SearchScreen() }
    )

    object List : Item(
        path = NavPath.LIST.toString(),
        title = NavTitle.LIST,
        icon = Icons.Default.List,
        screen = { ListScreen() }
    )

    object Profile : Item(
        path = NavPath.PROFILE.toString(),
        title = NavTitle.PROFILE,
        icon = Icons.Default.Person,
        screen = { ProfileScreen() }
    )
}
