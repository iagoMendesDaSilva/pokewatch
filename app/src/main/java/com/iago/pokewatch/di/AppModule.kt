package com.iago.pokewatch.di

import com.iago.pokewatch.BuildConfig
import com.iago.pokewatch.api.PokeApi
import com.iago.pokewatch.repository.PokeRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Singleton
    @Provides
    fun provideRepository(api: PokeApi) = PokeRepository(api)

    @Singleton
    @Provides
    fun provideApi(): PokeApi = Retrofit.Builder()
        .addConverterFactory((GsonConverterFactory.create()))
        .baseUrl(BuildConfig.API_BASE_URL)
        .build()
        .create(PokeApi::class.java)


}