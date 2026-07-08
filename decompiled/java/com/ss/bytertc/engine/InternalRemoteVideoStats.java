package com.ss.bytertc.engine;

/* JADX INFO: loaded from: classes21.dex */
public class InternalRemoteVideoStats {
    public int codecEventCode;
    public int codecType;
    public int decoderOutputFrameRate;
    public long e2eDelay;
    public int frozenRate;
    public int height;
    public boolean isHardwareCodec;
    public boolean isScreen;
    public int jitter;
    public int maxqp;
    public float receivedKBitrate;
    public int rendererOutputFrameRate;
    public int rtt;
    public int stallCount;
    public int stallDuration;
    public int statsInterval;
    public int superResolutionMode;
    public int videoIndex;
    public float videoLossRate;
    public int width;

    public InternalRemoteVideoStats() {
    }

    public InternalRemoteVideoStats(int i, int i2, float f, float f2, int i3, int i4, int i5, int i6, long j, boolean z, int i7, int i8, int i9, int i10, boolean z2, int i11, int i12, int i13, int i14, int i15) {
        this.width = i;
        this.height = i2;
        this.videoLossRate = f;
        this.receivedKBitrate = f2;
        this.decoderOutputFrameRate = i3;
        this.rendererOutputFrameRate = i4;
        this.stallCount = i5;
        this.stallDuration = i6;
        this.e2eDelay = j;
        this.isScreen = z;
        this.statsInterval = i7;
        this.rtt = i8;
        this.frozenRate = i9;
        this.codecType = i10;
        this.isHardwareCodec = z2;
        this.codecEventCode = i11;
        this.videoIndex = i12;
        this.jitter = i13;
        this.superResolutionMode = i14;
        this.maxqp = i15;
    }

    public static InternalRemoteVideoStats create(int i, int i2, float f, float f2, int i3, int i4, int i5, int i6, long j, boolean z, int i7, int i8, int i9, int i10, boolean z2, int i11, int i12, int i13, int i14, int i15) {
        return new InternalRemoteVideoStats(i, i2, f, f2, i3, i4, i5, i6, j, z, i7, i8, i9, i10, z2, i11, i12, i13, i14, i15);
    }
}
