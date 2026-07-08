package com.ss.ttlivestreamer.core.engine;

/* JADX INFO: loaded from: classes21.dex */
public class NativeObject {
    public volatile long mNativeObj;

    private native void nativeRelease(long j);

    public synchronized void release() {
        if (this.mNativeObj != 0) {
            nativeRelease(this.mNativeObj);
            this.mNativeObj = 0L;
        }
    }

    public void finalize() {
        if (this.mNativeObj != 0) {
            release();
        }
    }

    public long getNativeObj() {
        return this.mNativeObj;
    }

    public void setNativeObj(long j) {
        this.mNativeObj = j;
    }
}
