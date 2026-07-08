package com.bytedance.anrthanos.helper;

/* JADX INFO: loaded from: classes.dex */
public class LockHelper {
    public static native int nativeMonitorLockEnd();

    public static native int nativeMonitorLockStart();

    public static native boolean nativeStartDynamicTuningPriorityOpt(int i, Thread thread, long j, int i2, int i3);
}
