package com.ss.bytertc.engine;

/* JADX INFO: loaded from: classes21.dex */
public class InternalRemoteStreamStats {
    public InternalRemoteAudioStats audioStats;
    public boolean isScreen;
    public int rxQuality;
    public int txQuality;
    public String uid;
    public InternalRemoteVideoStats videoStats;

    public InternalRemoteStreamStats() {
    }

    public InternalRemoteStreamStats(String str, InternalRemoteAudioStats internalRemoteAudioStats, InternalRemoteVideoStats internalRemoteVideoStats, boolean z, int i, int i2) {
        this.uid = str;
        this.audioStats = internalRemoteAudioStats;
        this.videoStats = internalRemoteVideoStats;
        this.isScreen = z;
        this.txQuality = i;
        this.rxQuality = i2;
    }

    public static InternalRemoteStreamStats create(String str, InternalRemoteAudioStats internalRemoteAudioStats, InternalRemoteVideoStats internalRemoteVideoStats, boolean z, int i, int i2) {
        return new InternalRemoteStreamStats(str, internalRemoteAudioStats, internalRemoteVideoStats, z, i, i2);
    }
}
