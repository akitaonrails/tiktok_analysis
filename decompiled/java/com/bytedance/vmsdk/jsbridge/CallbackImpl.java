package com.bytedance.vmsdk.jsbridge;

import com.bytedance.vmsdk.jsbridge.utils.Callback;
import com.bytedance.vmsdk.jsbridge.utils.JavaOnlyArray;
import com.bytedance.vmsdk.jsbridge.utils.WritableArray;

/* JADX INFO: loaded from: classes31.dex */
public final class CallbackImpl implements Callback {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public boolean mInvoked = false;
    public long mNativePtr;

    private native void nativeInvoke(long j, WritableArray writableArray);

    private native void nativeReleaseNativePtr(long j);

    public void resetNativePtr() {
        this.mNativePtr = 0L;
    }

    public void finalize() throws Throwable {
        super.finalize();
        nativeReleaseNativePtr(this.mNativePtr);
    }

    public CallbackImpl(long j) {
        this.mNativePtr = j;
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.Callback
    public void invoke(Object... objArr) {
        if (this.mInvoked) {
            return;
        }
        long j = this.mNativePtr;
        if (j == 0) {
            return;
        }
        nativeInvoke(j, JavaOnlyArray.of(objArr));
        this.mInvoked = true;
    }

    public void invokeCallback(Object... objArr) {
        if (this.mInvoked) {
            return;
        }
        long j = this.mNativePtr;
        if (j == 0) {
            return;
        }
        nativeInvoke(j, JavaOnlyArray.of(objArr));
        this.mInvoked = true;
    }
}
