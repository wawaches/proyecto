package com.example.proyecto.components

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun BottomBar(navController: NavController) {

    NavigationBar {

        NavigationBarItem(
            selected = false,
            onClick = { navController.navigate("home") },
            icon = { Text("🏠") },
            label = { Text("Inicio") }
        )

        NavigationBarItem(
            selected = false,
            onClick = { navController.navigate("tasks") },
            icon = { Text("📚") },
            label = { Text("Tareas") }
        )

        NavigationBarItem(
            selected = false,
            onClick = { navController.navigate("routes") },
            icon = { Text("📍") },
            label = { Text("Rutas") }
        )

        NavigationBarItem(
            selected = false,
            onClick = { navController.navigate("habits") },
            icon = { Text("🔥") },
            label = { Text("Hábitos") }
        )
    }
}