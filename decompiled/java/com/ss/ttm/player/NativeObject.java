package com.ss.ttm.player;

/* JADX INFO: loaded from: classes24.dex */
public class NativeObject {
    public long LIZ;

    private native void nativeRelease(long j);

    public final void finalize() {
    }

    private long getNativeObj() {
        return this.LIZ;
    }

    public void setNativeObj(long j) {
        this.LIZ = j;
    }
}
