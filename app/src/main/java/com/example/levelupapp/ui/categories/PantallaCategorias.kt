package com.example.levelupapp.ui.categories

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.levelupapp.R



data class Product(
    val name: String,
    val price: String,
    val imageRes: Int
)

@Composable
fun CategoryScreen() {
    val categories = listOf("JUEGOS DE MESA", "JUEGOS DE CARTAS", "JUEGOS GAMER", "ROPA", "PERIFERICOS")

    val productsByCategory = mapOf(
        "JUEGOS DE MESA" to listOf(
            Product("THREE-DRAGON ANTE", "$22.990", R.drawable.threedragon),
            Product("MONOPOLY", "$15.990", R.drawable.monopoly),
            Product("CATAN", "$37.990", R.drawable.catan),
            Product("CARCASSONNE", "$32.990", R.drawable.carcassone),
            Product("PICTIONARY", "$27.990", R.drawable.pictionary)
        ),
        "JUEGOS DE CARTAS" to listOf(
            Product("POKEMON", "$5.990", R.drawable.pokemon),
            Product("MAGIC", "$4.990", R.drawable.magic),
            Product("VIRUS", "$10.990", R.drawable.virus),
            Product("UNO", "$8.990", R.drawable.uno),
            Product("¡TOMA 6!", "$5.990", R.drawable.toma6)
        ),
        "JUEGOS GAMER" to listOf(
            Product("FORTNITE", "$25.990", R.drawable.fortnite),
            Product("VALORANT", "$25.990", R.drawable.valorant),
            Product("MINECRAFT", "$40.990", R.drawable.minecraft),
            Product("LEAGUE OF LEGEND", "$25.990", R.drawable.leagueoflegend),
            Product("RUST", "$30.990", R.drawable.rust)
        ),
        "ROPA" to listOf(
            Product("GORRA NEGRA", "$10.990", R.drawable.gorranegra),
            Product("GORRA MORADA", "$10.990", R.drawable.gorramorada),
            Product("POLERA NARANJA", "$15.990", R.drawable.polerafnaticorange),
            Product("POLERON NEGRO", "$20.990", R.drawable.poleronnegro),
            Product("POLERA NEGRA", "$15.990", R.drawable.poleranegra)
        ),
        "PERIFERICOS" to listOf(
            Product("Mousepad Artisan", "$84.990", R.drawable.artisan),
            Product("WL Beast x mini pro", "$60.990", R.drawable.wlbeastxminipro),
            Product("ATK z87 pro", "$40.990", R.drawable.atkz87pro),
            Product("Mchose v9 pro black", "$90.990", R.drawable.mchosev9problack),
            Product("Monitor Gamer generico", "$150.990", R.drawable.monitor)
        )
    )

    var selectedCategory by remember { mutableStateOf(categories.first()) }

    Column(modifier = Modifier.fillMaxWidth().padding(16.dp)) {
        Text(text = "Categorías",
            style = MaterialTheme.typography.titleLarge,
            color = MaterialTheme.colorScheme.primary,)

        Spacer(modifier = Modifier.height(8.dp))

        LazyRow {
            items(categories) { category ->
                FilterChip(
                    selected = selectedCategory == category,
                    onClick = { selectedCategory = category },
                    label = { Text(category) },
                    modifier = Modifier.padding(end = 8.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn {
            items(productsByCategory[selectedCategory] ?: emptyList()) { product ->
                ProductItem(product = product)
            }
        }
    }
}