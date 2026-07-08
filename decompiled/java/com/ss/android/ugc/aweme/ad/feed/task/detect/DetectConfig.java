package com.ss.android.ugc.aweme.ad.feed.task.detect;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class DetectConfig {

    @C09CT("detect_chunk_interval_ms")
    public final Long _detectChunkInterval;

    @C09CT("detect_chunk_size")
    public final Integer _detectChunkSize;

    @C09CT("detect_intervals_ms")
    public final Long _detectIntervalMs;

    public DetectConfig() {
        this(null, null, null);
    }

    public DetectConfig(Integer num, Long l, Long l2) {
        this._detectChunkSize = num;
        this._detectChunkInterval = l;
        this._detectIntervalMs = l2;
    }
}
