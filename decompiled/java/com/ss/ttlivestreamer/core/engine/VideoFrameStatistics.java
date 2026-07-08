package com.ss.ttlivestreamer.core.engine;

import com.ss.ttlivestreamer.core.statics.StaticsReport;

/* JADX INFO: loaded from: classes21.dex */
public class VideoFrameStatistics {
    public static native boolean nativeGetStaticsReport(StaticsReport staticsReport);

    public static native boolean nativeReset();

    public static void reset() {
        nativeReset();
    }

    public boolean getStaticsReport(StaticsReport staticsReport) {
        return nativeGetStaticsReport(staticsReport);
    }
}
