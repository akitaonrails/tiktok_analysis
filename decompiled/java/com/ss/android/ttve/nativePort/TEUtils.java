package com.ss.android.ttve.nativePort;

/* JADX INFO: loaded from: classes21.dex */
public final class TEUtils {
    public static native long nativeGetPThreadId();

    public static native void nativeHookImageCopy();

    public static native void nativeSetEncodeThreadId(long j);

    public static native boolean nativeTryExecute(Runnable runnable);
}
