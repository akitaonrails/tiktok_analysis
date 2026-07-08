package com.ss.pusher.core.utils;

/* JADX INFO: loaded from: classes21.dex */
public class Monitor {
    public static native void nativeDisableLogFile(boolean z);

    public static native double nativeGetAppPrecentageOnCPU();

    public static native long nativeGetAppRSSKB();

    public static native long nativeGetAppVSSKB();

    public static native double nativeGetCPUPrecentage();

    public static native int nativeGetThreadCount();

    public static native boolean nativeInitLogFile(String str, int i);

    public static native void nativeWriteLog(String str, int i, String str2);
}
