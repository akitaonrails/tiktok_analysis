package com.ss.pusher.core.utils;

/* JADX INFO: loaded from: classes21.dex */
public class TimeUtils {
    public static native long nativeNanoTime();

    public static native long nativeTimeUTCMicros();

    public static long LIZ() {
        return nativeNanoTime() / 1000000;
    }
}
