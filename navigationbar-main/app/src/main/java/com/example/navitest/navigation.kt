package com.example.navitest
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.navitest.pages.Login


@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "login") {
        composable("login") {
            Login(navController)
        }
        composable("inicio") {
            PantallaInicial()
        }
    }
}

