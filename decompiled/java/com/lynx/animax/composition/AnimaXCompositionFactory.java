package com.lynx.animax.composition;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class AnimaXCompositionFactory {
    private native void nativeCreate(String str, long j);

    private native void nativeLoadJson(String str, String str2, float f, AnimaXCompositionNativeCallback animaXCompositionNativeCallback);

    private native void nativeLoadUri(String str, String str2, float f, AnimaXCompositionNativeCallback animaXCompositionNativeCallback);

    private native void nativeRelease();

    public AnimaXCompositionFactory() {
        new ConcurrentHashMap();
    }
}
