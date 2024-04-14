package com.example.learncompose.ui.compose.meditationui

sealed class Screen (val route: String) {
    object HomeScreen: Screen(route = "home_screen")
    object ProfileScreen: Screen(route = "profile_screen")
    object MeditationScreen: Screen(route = "profile_screen")
}