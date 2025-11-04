package com.example.levelupapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.navigation.compose.rememberNavController
import com.example.levelupapp.navigation.AppNavGraph
import com.example.levelupapp.ui.theme.PracticaTheme // usa el nombre de tu Theme de practica

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PracticaTheme {
                Surface {
                    val navController = rememberNavController()
                    AppNavGraph(navController)
                }
            }
        }
    }
}