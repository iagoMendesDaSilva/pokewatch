package com.iago.pokewatch.api

import com.iago.pokewatch.models.*
import retrofit2.http.*
import javax.inject.Singleton

@Singleton
interface PokeApi {

    @GET("pokemon.json")
    suspend fun getPokemons(): List<PokemonModel>

}