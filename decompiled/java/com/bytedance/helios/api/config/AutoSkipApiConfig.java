package com.bytedance.helios.api.config;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class AutoSkipApiConfig {

    @C09CT("average_cost")
    public final long averageCost;

    @C09CT("count")
    public final int count;

    @C09CT("skip_interval")
    public final long skipInterval;

    public AutoSkipApiConfig() {
        this(10, 20L, 180000L);
    }

    public AutoSkipApiConfig(int i, long j, long j2) {
        this.count = i;
        this.averageCost = j;
        this.skipInterval = j2;
    }
}
