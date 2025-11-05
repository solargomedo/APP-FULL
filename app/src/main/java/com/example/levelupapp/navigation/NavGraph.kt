package com.example.levelupapp.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.NavHostController
import com.example.levelupapp.ui.splash.SplashScreen
import com.example.levelupapp.ui.login.LoginScreen
import com.example.levelupapp.ui.home.HomeScreen
import com.example.levelupapp.ui.viewmodel.AuthViewModel

@Composable

fun AppNavGraph(navController: NavHostController) {

    val authViewModel: AuthViewModel = viewModel()

    NavHost(navController = navController, startDestination = "splash") {
        composable("splash") { SplashScreen(navController) }
        composable("login")   { LoginScreen(navController, authViewModel) }
        composable("home")    { HomeScreen(authViewModel) }
    }
}
