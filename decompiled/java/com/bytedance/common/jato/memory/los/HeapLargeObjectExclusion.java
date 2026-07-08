package com.bytedance.common.jato.memory.los;

import X.C2104908Ml;

/* JADX INFO: loaded from: classes34.dex */
public class HeapLargeObjectExclusion {
    public static native long getLargeObjectAllocatedBytes();

    public static native boolean nativeExcludeLOS();

    public static native boolean nativeSetLargeObjectThreshold(int i);

    public static native boolean nativeSetLargeObjectThresholdByByteSize(int i);

    public static native void nativeUseNewFree();

    public static native void needGcBlock(boolean z);

    static {
        C2104908Ml.LIZIZ();
    }
}
