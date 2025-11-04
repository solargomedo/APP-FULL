package com.example.levelupapp.ui.theme


import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val DarkColorScheme = darkColorScheme(
    primary = Color(0xFFE91E63),      // Rosa
    onPrimary = Color.White,          // Texto sobre rosa
    background = Color.Black,         // Fondo negro
    onBackground = Color.White,       // Texto sobre fondo
    surface = Color(0xFF121212),      // Superficie
    onSurface = Color.White
)

@Composable
fun PracticaTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = DarkColorScheme,
        typography = Typography,
        content = content
    )
}