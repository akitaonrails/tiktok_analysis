package com.ss.ttm.player;

import android.util.AndroidRuntimeException;

/* JADX INFO: loaded from: classes21.dex */
public class NativeABRStrategy extends ABRStrategy {
    public static boolean isNativeABRStrategy(ABRStrategy aBRStrategy) {
        return aBRStrategy instanceof NativeABRStrategy;
    }

    @Override // com.ss.ttm.player.ABRStrategy
    public final int probeBitrate(int i) {
        throw new AndroidRuntimeException("Should not be here");
    }

    @Override // com.ss.ttm.player.ABRStrategy
    public final String probeBitrate(String str) {
        throw new AndroidRuntimeException("Should not be here");
    }
}
