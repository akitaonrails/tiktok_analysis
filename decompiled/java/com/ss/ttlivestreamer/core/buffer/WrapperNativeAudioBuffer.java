package com.ss.ttlivestreamer.core.buffer;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class WrapperNativeAudioBuffer {
    public int mChannel;
    public long mNativeBuffer;
    public int mSampleRateHz;
    public int mSamplesPerChannel;
    public long timestampUs;

    public static ByteBuffer getDirectBuffer(WrapperNativeAudioBuffer wrapperNativeAudioBuffer) {
        return null;
    }

    public synchronized long extract() {
        long j;
        j = this.mNativeBuffer;
        this.mNativeBuffer = 0L;
        return j;
    }

    public WrapperNativeAudioBuffer(long j, int i, int i2, int i3, long j2) {
        this.mNativeBuffer = j;
        this.mSamplesPerChannel = i;
        this.mSampleRateHz = i2;
        this.mChannel = i3;
        this.timestampUs = j2;
    }
}
