package com.bytedance.common.jato.shrinker;

import X.C2104908Ml;

/* JADX INFO: loaded from: classes27.dex */
public class ShrinkerNativeHolder {
    public static boolean LIZ;

    public static native int shrinkHeapNative(int i);

    public static native int shrinkMallocNative(int i, int i2);

    public static native int shrinkRegionNative(int i);

    public static native int shrinkWebviewNative();

    public static synchronized boolean LIZ() {
        if (!LIZ && C2104908Ml.LIZIZ()) {
            LIZ = true;
        }
        return LIZ;
    }
}
