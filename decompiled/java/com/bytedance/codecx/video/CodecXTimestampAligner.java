package com.bytedance.codecx.video;

/* JADX INFO: loaded from: classes21.dex */
public class CodecXTimestampAligner {
    public volatile long nativeTimestampAligner = nativeCreateTimestampAligner();

    public static native long nativeCreateTimestampAligner();

    public static native void nativeReleaseTimestampAligner(long j);

    public static native long nativeTranslateTimestamp(long j, long j2);

    private void checkNativeAlignerExists() {
        if (this.nativeTimestampAligner == 0) {
            throw new IllegalStateException("CodecXTimestampAligner has been disposed.");
        }
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
