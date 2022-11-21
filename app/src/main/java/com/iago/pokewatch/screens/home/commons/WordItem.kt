package com.iago.pokewatch.screens.home.commons

import androidx.compose.runtime.Composable
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.*
import coil.compose.rememberAsyncImagePainter
import com.iago.pokewatch.models.PokemonModel
import com.iago.pokewatch.theme.BackGroundDark
import com.iago.pokewatch.theme.White
import com.iago.pokewatch.theme.WhiteOpacity
import com.iago.pokewatch.utils.FormatPokemon

@Composable
fun WordItem(pokemon: PokemonModel, index: Int, callback: (index: Int) -> Unit) {

    val type1 = FormatPokemon.getIcon(pokemon.typeofpokemon.getOrNull(0))
    val type2 = FormatPokemon.getIcon(pokemon.typeofpokemon.getOrNull(1))

    Chip(
        colors = ChipDefaults.chipColors(
            backgroundColor = BackGroundDark,
            contentColor = MaterialTheme.colors.primary
        ),
        onClick = { callback(index) },
        secondaryLabel = {
            Text(
                maxLines = 1,
                color = White,
                text = pokemon.name.toString(),
                overflow = TextOverflow.Ellipsis,
                style = MaterialTheme.typography.button,
            )
        },
        label = {
            Row(verticalAlignment = Alignment.CenterVertically) {
                if(type1!=null)
                Image(
                    painterResource(type1),
                    null,
                    modifier = Modifier
                        .size(17.dp)
                        .padding(end = 5.dp)
                )
                if(type2!=null)
                Image(
                    painterResource(type2),
                    null,
                    modifier = Modifier
                        .size(17.dp)
                        .padding(end = 5.dp)
                )
                Text(
                    maxLines = 1,
                    color = WhiteOpacity,
                    text = pokemon.id.toString(),
                    overflow = TextOverflow.Ellipsis,
                    style = MaterialTheme.typography.title2,
                )
            }
        },
        icon = {
            Image(
                painter = rememberAsyncImagePainter(pokemon.imageurl.toString()),
                contentDescription = null,
                modifier = Modifier.size(45.dp)
            )
        },
    )
}