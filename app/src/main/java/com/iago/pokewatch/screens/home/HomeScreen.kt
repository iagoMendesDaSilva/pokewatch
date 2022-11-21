package com.iago.pokewatch.screens.home

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.wear.compose.material.*
import com.iago.pokewatch.screens.home.commons.ItemExpanded
import com.iago.pokewatch.screens.home.commons.ListWords
import com.iago.pokewatch.screens.home.commons.Load
import com.iago.pokewatch.screens.home.commons.Refresh

@Composable
fun HomeScreen() {

    val context = LocalContext.current
    val listState = rememberScalingLazyListState()
    val homeViewModel = hiltViewModel<HomeViewModel>()

    val pokemons = homeViewModel.pokemons.collectAsState().value
    val indexItem = remember { mutableStateOf<Int?>(null) }

    LaunchedEffect(key1 = true, block = {
        homeViewModel.getPokemons()
    })

    if (homeViewModel.error.value != null)
        Toast.makeText(
            context,
            stringResource(id = homeViewModel.error.value!!),
            Toast.LENGTH_SHORT
        )
            .show()

    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colors.background),
        timeText = {
            if (!listState.isScrollInProgress)
                TimeText()
        },
        vignette = { VignettePosition.TopAndBottom },
        positionIndicator = { PositionIndicator(scalingLazyListState = listState) }
    ) {
        if (homeViewModel.error.value == null)
            ListWords(listState, pokemons) { indexItem.value = it }
        else
            Refresh() { homeViewModel.getPokemons() }

        if (homeViewModel.loading.value)
            Load()

        if (indexItem.value != null)
            ItemExpanded(pokemons, indexItem)
    }
}


