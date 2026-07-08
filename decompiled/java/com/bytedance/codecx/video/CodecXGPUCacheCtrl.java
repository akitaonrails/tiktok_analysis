package com.bytedance.codecx.video;

/* JADX INFO: loaded from: classes21.dex */
public class CodecXGPUCacheCtrl {
    public static CodecXGPUCacheCtrl instance;
    public long nativeHandle;

    public static native void nativeBind(long j);

    public static native CodecXGPUCacheCtrl nativeGetInstance();

    public static native void nativeUnBind(long j);

    public void bind() {
        nativeBind(this.nativeHandle);
    }

    public void unbind() {
        nativeUnBind(this.nativeHandle);
    }

    public static CodecXGPUCacheCtrl getInstance() {
        CodecXGPUCacheCtrl codecXGPUCacheCtrlNativeGetInstance = nativeGetInstance();
        instance = codecXGPUCacheCtrlNativeGetInstance;
        return codecXGPUCacheCtrlNativeGetInstance;
    }

    public CodecXGPUCacheCtrl(long j) {
        this.nativeHandle = j;
    }
}
