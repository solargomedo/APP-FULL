package com.example.levelupapp.ui.splash

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.levelupapp.R
import kotlinx.coroutines.delay




@Composable
fun SplashScreen(navController: NavController) {
   
    var progress by remember { mutableStateOf(0f) }
    
    var visible by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        visible = true
        val splashDuration = 2500L 
        val steps = 50
        val stepDuration = splashDuration / steps

        
        for (i in 0..steps) {
            progress = i / steps.toFloat()
            delay(stepDuration)
        }

        visible = false
        delay(500)
        navController.navigate("login") {
            popUpTo("splash") { inclusive = true }
        }
    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        AnimatedVisibility(
            visible = visible,
            enter = fadeIn(),
            exit = fadeOut()
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "Logo",
                    modifier = Modifier.size(180.dp)
                )
                Spacer(modifier = Modifier.height(24.dp))

                Text(
                    text = "LEVEL-UP ! ! !",
                    fontFamily = FontFamily(Font(R.font.press_start_2p_regular, FontWeight.Normal)),
                    style = MaterialTheme.typography.headlineMedium,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.primary
                )
                Spacer(modifier = Modifier.height(24.dp))
                LinearProgressIndicator(
                    progress = progress,
                    modifier = Modifier
                        .width(180.dp)
                        .height(8.dp)
                )
            }
        }
    }
}
