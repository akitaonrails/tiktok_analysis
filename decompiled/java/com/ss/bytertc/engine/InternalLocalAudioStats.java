package com.ss.bytertc.engine;

/* JADX INFO: loaded from: classes21.dex */
public class InternalLocalAudioStats {
    public float audioLossRate;
    public int jitter;
    public int numChannels;
    public int recordSampleRate;
    public int rtt;
    public int sendKBitrate;
    public int sentSampleRate;
    public int statsInterval;

    public InternalLocalAudioStats() {
    }

    public InternalLocalAudioStats(float f, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.audioLossRate = f;
        this.sendKBitrate = i;
        this.recordSampleRate = i2;
        this.statsInterval = i3;
        this.rtt = i4;
        this.numChannels = i5;
        this.sentSampleRate = i6;
        this.jitter = i7;
    }

    public static InternalLocalAudioStats create(float f, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return new InternalLocalAudioStats(f, i, i2, i3, i4, i5, i6, i7);
    }
}
