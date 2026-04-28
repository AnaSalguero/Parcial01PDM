package com.pdm0126.orderup

import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.togetherWith
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import androidx.navigation3.runtime.entryProvider
import com.pdm0126.orderup.Screens.MenuScreen
import com.pdm0126.orderup.Screens.orderScreen

@Composable
fun OrderApp(){
    val backStack = rememberNavBackStack(Routes.Menu)

    NavDisplay(
        backStack = backStack,
        onBack = { backStack.removeLastOrNull() },
        entryProvider = entryProvider {
            entry<Routes.Menu> {
                MenuScreen()
            }
            entry<Routes.Order> { key ->
                orderScreen()
            }
        }
    )
}