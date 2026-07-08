package com.bytedance.otis.memory;

/* JADX INFO: loaded from: classes5.dex */
public final class OtisMemoryDeterioration {
    public static byte[] javaByteArray;

    public static final native long applyNative(int i);

    static {
        new OtisMemoryDeterioration();
        EnsureLoad.init();
    }
}
