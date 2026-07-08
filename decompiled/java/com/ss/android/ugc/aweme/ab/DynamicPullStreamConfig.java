package com.ss.android.ugc.aweme.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class DynamicPullStreamConfig {

    @C09CT("delay_time")
    public final long delayTime;

    @C09CT("fix_observer")
    public final boolean fixObserver;

    @C09CT("keep_time_type")
    public final int keepTimeType;

    @C09CT("start_type")
    public final int startType;

    public DynamicPullStreamConfig() {
        this(0L, 0, 0, false);
    }

    public DynamicPullStreamConfig(long j, int i, int i2, boolean z) {
        this.delayTime = j;
        this.startType = i;
        this.keepTimeType = i2;
        this.fixObserver = z;
    }
}
