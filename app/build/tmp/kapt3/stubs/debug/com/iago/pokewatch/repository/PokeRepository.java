package com.iago.pokewatch.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/iago/pokewatch/repository/PokeRepository;", "Lcom/iago/pokewatch/utils/ErrorService;", "api", "Lcom/iago/pokewatch/api/PokeApi;", "(Lcom/iago/pokewatch/api/PokeApi;)V", "getPokemons", "Lcom/iago/pokewatch/utils/Resource;", "", "Lcom/iago/pokewatch/models/PokemonModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class PokeRepository implements com.iago.pokewatch.utils.ErrorService {
    private final com.iago.pokewatch.api.PokeApi api = null;
    
    @javax.inject.Inject()
    public PokeRepository(@org.jetbrains.annotations.NotNull()
    com.iago.pokewatch.api.PokeApi api) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPokemons(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.iago.pokewatch.utils.Resource<java.util.List<com.iago.pokewatch.models.PokemonModel>>> continuation) {
        return null;
    }
    
    public int getErrorMessage(int statusCode, int messageFail) {
        return 0;
    }
}