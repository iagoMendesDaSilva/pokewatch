// Generated by Dagger (https://dagger.dev).
package com.iago.pokewatch.repository;

import com.iago.pokewatch.api.PokeApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PokeRepository_Factory implements Factory<PokeRepository> {
  private final Provider<PokeApi> apiProvider;

  public PokeRepository_Factory(Provider<PokeApi> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public PokeRepository get() {
    return newInstance(apiProvider.get());
  }

  public static PokeRepository_Factory create(Provider<PokeApi> apiProvider) {
    return new PokeRepository_Factory(apiProvider);
  }

  public static PokeRepository newInstance(PokeApi api) {
    return new PokeRepository(api);
  }
}
