package com.bytedance.common.jato.jit;

/* JADX INFO: loaded from: classes36.dex */
public class JitSuspend {
    public static native long getJitDumpNativeMethod();

    public static native void nativeBegin();

    public static native void nativeEnableJitDump(int i);

    public static native void nativeEnd();

    public static native boolean nativeInit();
}
