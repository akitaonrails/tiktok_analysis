package com.ttkmedia.datacenter.common;

/* JADX INFO: loaded from: classes10.dex */
public class NativeObject {
    public long mNativeObj;
    public boolean mRetain;

    private native void nativeRelease(long j);

    public void finalize() {
    }

    public synchronized void release() {
        if (this.mRetain) {
            long j = this.mNativeObj;
            if (j != 0) {
                nativeRelease(j);
                this.mNativeObj = 0L;
            }
        }
    }

    private long getNativeObj() {
        return this.mNativeObj;
    }

    public void setNativeObj(long j) {
        this.mNativeObj = j;
        this.mRetain = true;
    }

    public void setWeakNativeObj(long j) {
        this.mNativeObj = j;
        this.mRetain = false;
    }
}
