package com.ss.lyrax.stream;

import com.ss.lyrax.net.LyraxNetworkQuality;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxNetworkQualityStats {
    public double fractionLost;
    public int jitter;
    public int rtt;
    public LyraxNetworkQuality rxQuality;
    public long timestamp_ms;
    public int totalBandwidth;
    public LyraxNetworkQuality txQuality;
    public String userId = "";

    public LyraxNetworkQualityStats() {
        LyraxNetworkQuality lyraxNetworkQuality = LyraxNetworkQuality.UNKNOWN;
        this.txQuality = lyraxNetworkQuality;
        this.rxQuality = lyraxNetworkQuality;
    }

    public double getFractionLost() {
        return this.fractionLost;
    }

    public int getJitter() {
        return this.jitter;
    }

    public int getRtt() {
        return this.rtt;
    }

    public LyraxNetworkQuality getRxQuality() {
        return this.rxQuality;
    }

    public long getTimestampMs() {
        return this.timestamp_ms;
    }

    public int getTotalBandwidth() {
        return this.totalBandwidth;
    }

    public LyraxNetworkQuality getTxQuality() {
        return this.txQuality;
    }

    public String getUserId() {
        return this.userId;
    }

    public static LyraxNetworkQualityStats create(String str, double d, int i, int i2, int i3, long j, LyraxNetworkQuality lyraxNetworkQuality, LyraxNetworkQuality lyraxNetworkQuality2) {
        LyraxNetworkQualityStats lyraxNetworkQualityStats = new LyraxNetworkQualityStats();
        lyraxNetworkQualityStats.userId = str;
        lyraxNetworkQualityStats.fractionLost = d;
        lyraxNetworkQualityStats.rtt = i;
        lyraxNetworkQualityStats.totalBandwidth = i2;
        lyraxNetworkQualityStats.jitter = i3;
        lyraxNetworkQualityStats.timestamp_ms = j;
        lyraxNetworkQualityStats.txQuality = lyraxNetworkQuality;
        lyraxNetworkQualityStats.rxQuality = lyraxNetworkQuality2;
        return lyraxNetworkQualityStats;
    }

    public void updateInfo(String str, double d, int i, int i2, int i3, long j, int i4, int i5) {
        this.userId = str;
        this.fractionLost = d;
        this.rtt = i;
        this.totalBandwidth = i2;
        this.jitter = i3;
        this.timestamp_ms = j;
        this.txQuality = LyraxNetworkQuality.fromId(i4);
        this.rxQuality = LyraxNetworkQuality.fromId(i5);
    }
}
