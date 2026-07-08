package com.bytedance.android.strategy;

import X.C09CT;
import java.io.Serializable;
import webcast.api.room.StrategyData;

/* JADX INFO: loaded from: classes8.dex */
public final class CacheEntry implements Serializable {

    @C09CT("data")
    public final StrategyData data;

    @C09CT("timestamp")
    public final long timestamp;

    public CacheEntry(StrategyData strategyData, long j) {
        this.data = strategyData;
        this.timestamp = j;
    }
}
