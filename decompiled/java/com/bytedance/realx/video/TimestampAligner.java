package com.bytedance.realx.video;

/* JADX INFO: loaded from: classes21.dex */
public class TimestampAligner {
    public volatile long nativeTimestampAligner = nativeCreateTimestampAligner();

    public static native long nativeCreateTimestampAligner();

    public static native void nativeReleaseTimestampAligner(long j);

    public static native long nativeRtcTimeNanos();

    public static native long nativeTranslateTimestamp(long j, long j2);

    private void checkNativeAlignerExists() {
        if (this.nativeTimestampAligner == 0) {
            throw new IllegalStateException("TimestampAligner has been disposed.");
        }
    }

    public static long getRtcTimeNanos() {
        return nativeRtcTimeNanos();
    }

    public void dispose() {
        checkNativeAlignerExists();
        nativeReleaseTimestampAligner(this.nativeTimestampAligner);
        this.nativeTimestampAligner = 0L;
    }

    public long translateTimestamp(long j) {
        checkNativeAlignerExists();
        return nativeTranslateTimestamp(this.nativeTimestampAligner, j);
    }
}
