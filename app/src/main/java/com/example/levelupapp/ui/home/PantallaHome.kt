package com.example.levelupapp.ui.home

import androidx.compose.foundation.Image
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.levelupapp.ui.categories.CategoryScreen
import com.example.levelupapp.R
@Composable
fun HomeScreen() {
    var selected by remember { mutableStateOf(0) }
    val items = listOf("Bienvenida", "Categorías", "Perfil")
    val icons = listOf(Icons.Default.Home, Icons.Default.List, Icons.Default.Person)

    Scaffold(
        bottomBar = {
            NavigationBar {
                items.forEachIndexed { index, item ->
                    NavigationBarItem(
                        selected = selected == index,
                        onClick = { selected = index },
                        label = { Text(item) },
                        icon = { Icon(icons[index], contentDescription = item) }
                    )
                }
            }
        }
    ) { padding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {
            when (selected) {


                0 -> Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(padding)
                        .padding(24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.logo),
                        contentDescription = "Logo Level-Up",
                        modifier = Modifier
                            .size(160.dp)
                            .padding(top = 32.dp)
                    )

                    Spacer(modifier = Modifier.height(24.dp))

                    Text(
                        text = "¡Bienvenido a Level-Up!",
                        style = MaterialTheme.typography.headlineSmall,
                        color = MaterialTheme.colorScheme.primary
                    )

                    Spacer(modifier = Modifier.height(24.dp))

                    Text(
                        text = "Somos una tienda enfocada en la comunidad gamer, " +
                                "la tecnología y el estilo urbano. Nuestro objetivo " +
                                "es ayudarte a llevar tu setup y tu estilo al siguiente nivel !!!",
                        style = MaterialTheme.typography.bodyMedium,
                        lineHeight = 20.sp
                    )

                    Spacer(modifier = Modifier.height(40.dp))

                    Text(
                        text = "Contáctanos:",
                        style = MaterialTheme.typography.titleMedium,
                        color = MaterialTheme.colorScheme.primary
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = "Telefono: +56 9 8765 4321",
                        style = MaterialTheme.typography.bodyLarge
                    )

                    Text(
                        text = "Correo: soporte@levelupapp.cl",
                        style = MaterialTheme.typography.bodyLarge
                    )
                }


                1 -> CategoryScreen()


                2 -> Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Top
                ) {
                    Spacer(modifier = Modifier.height(32.dp))

                    Text(
                        text = "Tu Perfil",
                        style = MaterialTheme.typography.headlineSmall,
                        color = MaterialTheme.colorScheme.primary,
                        fontSize = 28.sp
                    )

                    Spacer(modifier = Modifier.height(32.dp))

                    Image(
                        painter = painterResource(id = R.drawable.bodoque),
                        contentDescription = "Foto de perfil",
                        modifier = Modifier
                            .size(160.dp)
                            .clip(CircleShape)
                    )

                    Spacer(modifier = Modifier.height(24.dp))

                    Text(
                        text = "Nombre de usuario:",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.primary
                    )

                    Text(
                        text = "Bodoque",
                        style = MaterialTheme.typography.headlineSmall,
                        fontSize = 22.sp
                    )
                }
            }
        }
    }
}