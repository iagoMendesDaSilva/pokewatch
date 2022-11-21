package com.iago.pokewatch;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = PokeWatchApplication.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface PokeWatchApplication_GeneratedInjector {
  void injectPokeWatchApplication(PokeWatchApplication pokeWatchApplication);
}
