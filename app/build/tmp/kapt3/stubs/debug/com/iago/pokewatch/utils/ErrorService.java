package com.iago.pokewatch.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016\u00a8\u0006\u0006"}, d2 = {"Lcom/iago/pokewatch/utils/ErrorService;", "", "getErrorMessage", "", "statusCode", "messageFail", "app_debug"})
public abstract interface ErrorService {
    
    public abstract int getErrorMessage(int statusCode, int messageFail);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
        
        public static int getErrorMessage(@org.jetbrains.annotations.NotNull()
        com.iago.pokewatch.utils.ErrorService $this, int statusCode, int messageFail) {
            return 0;
        }
    }
}