package com.ss.android.ugc.aweme.im.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class SearchMessageUpdateBufferConfig {

    @C09CT("channel_capacity")
    public final int channelCapacity;

    @C09CT("chunk_size")
    public final int chunkSize;

    @C09CT("timeout_millis")
    public final long timeOutMillis;

    public SearchMessageUpdateBufferConfig() {
        this(20, 2000L, 60);
    }

    public SearchMessageUpdateBufferConfig(int i, long j, int i2) {
        this.chunkSize = i;
        this.timeOutMillis = j;
        this.channelCapacity = i2;
    }
}
