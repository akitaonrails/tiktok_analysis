package com.bytedance.otis.resource.lock;

import com.bytedance.otis.resource.util.EnsureLoad;

/* JADX INFO: loaded from: classes4.dex */
public final class LockNative {
    public static final native void close();

    public static final native void print(long j);

    public static final native boolean start(int i, String[] strArr, boolean z, boolean z2, int i2);

    static {
        new LockNative();
        EnsureLoad.LIZ.init();
    }
}
