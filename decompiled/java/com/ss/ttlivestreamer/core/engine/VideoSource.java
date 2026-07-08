package com.ss.ttlivestreamer.core.engine;

import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.statics.StaticsReport;
import com.ss.ttlivestreamer.core.utils.TEBundle;

/* JADX INFO: loaded from: classes21.dex */
public abstract class VideoSource extends MediaSource {
    private native VideoFrame.I420Buffer nativeGetBlackFrameBuffer(int i, int i2);

    @Override // com.ss.ttlivestreamer.core.engine.MediaSource
    public boolean getStaticsReport(StaticsReport staticsReport) {
        return false;
    }

    public abstract boolean isScreenCast();

    public native void nativeAdaptedOutputFormat(int i, int i2, int i3, TEBundle tEBundle);

    public native int nativeOnFrame(VideoFrame.Buffer buffer, int i, int i2, int i3, long j);

    public VideoFrame.I420Buffer GetBlackFrameBuffer(int i, int i2) {
        return nativeGetBlackFrameBuffer(i, i2);
    }

    public void adaptOutputFormat(int i, int i2, int i3) {
        nativeAdaptedOutputFormat(i, i2, i3, null);
    }

    public void nativeAdaptedOutputFormat(int i, int i2, int i3) {
        nativeAdaptedOutputFormat(i, i2, i3, null);
    }

    public void adaptOutputFormat(int i, int i2, int i3, int i4, int i5, TEBundle tEBundle) {
        nativeAdaptedOutputFormat(i, i2, i5, tEBundle);
    }
}
