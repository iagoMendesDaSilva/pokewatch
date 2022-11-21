package com.iago.pokewatch.screens.home.commons

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.ScalingLazyColumn
import androidx.wear.compose.material.ScalingLazyListState
import com.iago.pokewatch.models.PokemonModel

@Composable
fun ListWords(
    listState: ScalingLazyListState,
    pokemons: List<PokemonModel>,
    callback: (index: Int) -> Unit
) {

    ScalingLazyColumn(
        state = listState,
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(6.dp),
    ) {
        items(pokemons.size) { index ->
            WordItem(pokemons[index], index, callback)
        }
    }
}