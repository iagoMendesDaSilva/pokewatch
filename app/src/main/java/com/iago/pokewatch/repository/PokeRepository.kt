package com.iago.pokewatch.repository

import com.iago.pokewatch.R
import com.iago.pokewatch.api.PokeApi
import com.iago.pokewatch.models.PokemonModel
import com.iago.pokewatch.utils.ErrorService
import com.iago.pokewatch.utils.Resource
import retrofit2.HttpException
import javax.inject.Inject

class PokeRepository @Inject constructor(private val api: PokeApi) : ErrorService {

    suspend fun getPokemons(): Resource<List<PokemonModel>> {
        val response = try {
            api.getPokemons()
        } catch (e: HttpException) {
            return Resource.Error(R.string.error_default)
        } catch (e: Exception) {
            return Resource.Error(R.string.error_default)
        }
        return Resource.Success(response)
    }
}