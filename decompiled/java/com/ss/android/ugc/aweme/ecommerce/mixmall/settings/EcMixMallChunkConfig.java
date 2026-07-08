package com.ss.android.ugc.aweme.ecommerce.mixmall.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class EcMixMallChunkConfig {

    @C09CT("adapt_merge_render")
    public final int adaptMergeRender;

    @C09CT("chunk2_await_timeout")
    public final long chunk2AwaitTimeout;

    @C09CT("chunk2_high_priority")
    public final int chunk2HighPriority;

    @C09CT("enable")
    public final int enable;

    @C09CT("gson_opt")
    public final int gsonOpt;

    @C09CT("opt_backpressure")
    public final int optBackpressure;

    @C09CT("webcast_lru_disk_opt")
    public final int webcastLruDiskOpt;

    public EcMixMallChunkConfig() {
        this(0, 0, 0, 0, 3000L, 1, 1);
    }

    public EcMixMallChunkConfig(int i, int i2, int i3, int i4, long j, int i5, int i6) {
        this.enable = i;
        this.gsonOpt = i2;
        this.webcastLruDiskOpt = i3;
        this.chunk2HighPriority = i4;
        this.chunk2AwaitTimeout = j;
        this.optBackpressure = i5;
        this.adaptMergeRender = i6;
    }
}
