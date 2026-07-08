package com.bytedance.otis.resource.memory;

import com.bytedance.otis.resource.util.EnsureLoad;

/* JADX INFO: loaded from: classes4.dex */
public final class MemoryNative {
    public static final native long getNativeHeapAllocSize();

    public static final native long getTotalPssSize();

    static {
        new MemoryNative();
        EnsureLoad.LIZ.init();
    }
}
