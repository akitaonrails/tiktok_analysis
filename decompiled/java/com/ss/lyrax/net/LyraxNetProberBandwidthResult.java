package com.ss.lyrax.net;

/* JADX INFO: loaded from: classes36.dex */
public class LyraxNetProberBandwidthResult {
    public long bandwidth;
    public long event3;
    public String message;
    public LyraxNetProberResult result;

    public LyraxNetProberBandwidthResult() {
    }

    public LyraxNetProberBandwidthResult(LyraxNetProberResult lyraxNetProberResult, long j, long j2, String str) {
        this.result = lyraxNetProberResult;
        this.bandwidth = j;
        this.event3 = j2;
        this.message = str;
    }
}
