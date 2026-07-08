package com.ss.ttlivestreamer.core.utils;

import com.ss.ttlivestreamer.core.engine.MediaEngineFactory;

/* JADX INFO: loaded from: classes21.dex */
public class TimeUtils {
    public static int sLocalTimeGapWithServerMSec;

    public static native long nativeNanoTime();

    public static native long nativeTimeUTCMicros();

    public static long currentTimeMs() {
        return nativeNanoTime() / 1000000;
    }

    public static long getServerTimeMSec() {
        return System.currentTimeMillis() + ((long) sLocalTimeGapWithServerMSec);
    }

    static {
        MediaEngineFactory.getVersion();
    }

    public static int getServerGapTime() {
        return sLocalTimeGapWithServerMSec;
    }

    public static void setLocalTimeGapWithServer(int i) {
        sLocalTimeGapWithServerMSec = i;
    }
}
