package com.example.proyecto.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.*
import com.example.proyecto.screens.home.HomeScreen
import com.example.proyecto.screens.splash.SplashScreen
import com.example.proyecto.screens.tasks.TasksScreen
import com.example.proyecto.screens.alarms.AlarmScreen
import com.example.proyecto.screens.routes.RoutesScreen
import com.example.proyecto.screens.habits.HabitsScreen
import com.example.proyecto.screens.profile.ProfileScreen

@Composable
fun AppNavigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "splash"
    ) {

        composable("splash") {
            SplashScreen(navController)
        }

        composable("home") {
            HomeScreen(navController)
        }

        composable("tasks") {
            TasksScreen()
        }

        composable("alarms") {
            AlarmScreen()
        }

        composable("routes") {
            RoutesScreen()
        }

        composable("habits") {
            HabitsScreen()
        }

        composable("profile") {
            ProfileScreen()
        }
    }
}