package com.iago.pokewatch.screens.home

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.iago.pokewatch.R
import com.iago.pokewatch.models.PokemonModel
import com.iago.pokewatch.repository.PokeRepository
import com.iago.pokewatch.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject
constructor(
    private val repository: PokeRepository,
) : ViewModel() {

    private val _pokemons = MutableStateFlow<List<PokemonModel>>(emptyList())
    val pokemons = _pokemons.asStateFlow()

    var loading = mutableStateOf(false)
    var error = mutableStateOf<Int?>(null)

    private fun startValuesToRequest() {
        loading.value = true
        error.value = null
    }

    fun getPokemons() {
        viewModelScope.launch {
            startValuesToRequest()
            when (val response = repository.getPokemons()) {
                is Resource.Success -> _pokemons.value =response.data!!
                is Resource.Error -> error.value = R.string.error_default
            }
            loading.value = false
        }
    }


}