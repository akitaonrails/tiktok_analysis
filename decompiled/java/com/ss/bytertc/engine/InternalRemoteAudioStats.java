package com.ss.bytertc.engine;

/* JADX INFO: loaded from: classes21.dex */
public class InternalRemoteAudioStats {
    public float audioLossRate;
    public int concealedSamples;
    public int concealmentEvent;
    public int decDuration;
    public int decSampleRate;
    public long e2eDelay;
    public int frozenRate;
    public int jitter;
    public int jitterBufferDelay;
    public int numChannels;
    public int playoutSampleRate;
    public int quality;
    public int receivedKBitrate;
    public int receivedSampleRate;
    public int rtt;
    public int stallCount;
    public int stallDuration;
    public int statsInterval;
    public int totalRtt;

    public InternalRemoteAudioStats() {
    }

    public InternalRemoteAudioStats(float f, int i, int i2, int i3, long j, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.audioLossRate = f;
        this.receivedKBitrate = i;
        this.stallCount = i2;
        this.stallDuration = i3;
        this.e2eDelay = j;
        this.statsInterval = i5;
        this.rtt = i6;
        this.totalRtt = i7;
        this.quality = i8;
        this.jitterBufferDelay = i9;
        this.numChannels = i10;
        this.receivedSampleRate = i11;
        this.frozenRate = i12;
        this.concealedSamples = i13;
        this.concealmentEvent = i14;
        this.decSampleRate = i15;
        this.decDuration = i16;
        this.jitter = i17;
    }

    public static InternalRemoteAudioStats create(float f, int i, int i2, int i3, long j, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        return new InternalRemoteAudioStats(f, i, i2, i3, j, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17);
    }
}
