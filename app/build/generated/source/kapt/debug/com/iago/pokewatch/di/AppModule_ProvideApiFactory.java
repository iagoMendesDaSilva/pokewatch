// Generated by Dagger (https://dagger.dev).
package com.iago.pokewatch.di;

import com.iago.pokewatch.api.PokeApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideApiFactory implements Factory<PokeApi> {
  @Override
  public PokeApi get() {
    return provideApi();
  }

  public static AppModule_ProvideApiFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static PokeApi provideApi() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideApi());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideApiFactory INSTANCE = new AppModule_ProvideApiFactory();
  }
}
