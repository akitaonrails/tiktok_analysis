package com.ss.android.ugc.aweme.legoImp.task.region;

import X.C09CT;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes28.dex */
public final class PushFrequencyLimit {

    @C09CT("max_count")
    public final int maxCount;

    @C09CT("min_interval_mills")
    public final long minIntervalMills;

    public PushFrequencyLimit() {
        this(10, TimeUnit.MINUTES.toMillis(5L));
    }

    public PushFrequencyLimit(int i, long j) {
        this.maxCount = i;
        this.minIntervalMills = j;
    }
}
