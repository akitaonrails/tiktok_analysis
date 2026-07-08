package com.bytedance.realx.video.agfx;

/* JADX INFO: loaded from: classes21.dex */
public class RXGPUCacheCtrl {
    public static RXGPUCacheCtrl instance;
    public long nativeHandle;

    public static native void nativeBind(long j);

    public static native RXGPUCacheCtrl nativeGetInstance();

    public static native void nativeUnBind(long j);

    public void bind() {
        nativeBind(this.nativeHandle);
    }

    public void unbind() {
        nativeUnBind(this.nativeHandle);
    }

    public static RXGPUCacheCtrl getInstance() {
        RXGPUCacheCtrl rXGPUCacheCtrlNativeGetInstance = nativeGetInstance();
        instance = rXGPUCacheCtrlNativeGetInstance;
        return rXGPUCacheCtrlNativeGetInstance;
    }

    public RXGPUCacheCtrl(long j) {
        this.nativeHandle = j;
    }
}
