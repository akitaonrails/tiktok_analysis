package com.ss.bytertc.engine;

/* JADX INFO: loaded from: classes21.dex */
public class NetworkTimeInfo {
    public long timestamp;

    public static NetworkTimeInfo create() {
        return new NetworkTimeInfo();
    }

    public void nativeSetTimestamp(long j) {
        this.timestamp = j;
    }
}
