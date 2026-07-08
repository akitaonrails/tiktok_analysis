package com.ss.bytertc.engine;

/* JADX INFO: loaded from: classes21.dex */
public class InternalLocalStreamStats {
    public InternalLocalAudioStats audioStats;
    public boolean isScreen;
    public int rxQuality;
    public int txQuality;
    public InternalLocalVideoStats videoStats;

    public InternalLocalStreamStats() {
    }

    public InternalLocalStreamStats(InternalLocalAudioStats internalLocalAudioStats, InternalLocalVideoStats internalLocalVideoStats, boolean z, int i, int i2) {
        this.audioStats = internalLocalAudioStats;
        this.videoStats = internalLocalVideoStats;
        this.isScreen = z;
        this.txQuality = i;
        this.rxQuality = i2;
    }

    public static InternalLocalStreamStats create(InternalLocalAudioStats internalLocalAudioStats, InternalLocalVideoStats internalLocalVideoStats, boolean z, int i, int i2) {
        return new InternalLocalStreamStats(internalLocalAudioStats, internalLocalVideoStats, z, i, i2);
    }
}
