package com.dawinder.btnjc.nav

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavBackStackEntry

open class Item(val path: String, val title: String, val icon: ImageVector, val screen: @Composable (NavBackStackEntry) -> Unit)