package com.iago.pokewatch.screens.home.commons

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.MaterialTheme
import androidx.wear.compose.material.SwipeToDismissBox
import androidx.wear.compose.material.Text
import coil.compose.rememberAsyncImagePainter
import com.iago.pokewatch.models.PokemonModel
import com.iago.pokewatch.theme.BackGroundDark
import com.iago.pokewatch.theme.WhiteOpacity
import com.iago.pokewatch.utils.FormatPokemon

@Composable
fun ItemExpanded(pokemons: List<PokemonModel>, indexItem: MutableState<Int?>) {

    val item = pokemons[indexItem.value!!]

    SwipeToDismissBox(
        backgroundScrimColor = FormatPokemon.getColorByType(item.typeofpokemon.getOrNull(0)),
        onDismissed = { indexItem.value = null },
    ) { isBackground ->
        if (isBackground) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(BackGroundDark)
            )
        } else {
            Box(
                modifier = Modifier
                    .fillMaxSize(),
                contentAlignment = Alignment.Center,
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth(.9f),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Image(
                        painter = rememberAsyncImagePainter(item.imageurl.toString()),
                        contentDescription = null,
                        modifier = Modifier.size(100.dp)
                    )
                    Text(
                        maxLines = 1,
                        text = item.name.toString(),
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.body2,
                    )
                    Text(
                        maxLines = 1,
                        color = WhiteOpacity,
                        text = item.id.toString(),
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.body1,
                    )
                }
            }
        }
    }
}