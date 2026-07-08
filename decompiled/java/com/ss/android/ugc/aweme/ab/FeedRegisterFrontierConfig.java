package com.ss.android.ugc.aweme.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class FeedRegisterFrontierConfig {

    @C09CT("delay_time")
    public final long delayTime;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("end_index")
    public final int endIndex;

    @C09CT("max_delay_time")
    public final long maxDelayTime;

    @C09CT("replenish_register")
    public final boolean replenishRegister;

    @C09CT("start_index")
    public final int startIndex;

    public FeedRegisterFrontierConfig() {
        this(60, 30, false, true, 3000L, 25000L);
    }

    public FeedRegisterFrontierConfig(int i, int i2, boolean z, boolean z2, long j, long j2) {
        this.startIndex = i;
        this.endIndex = i2;
        this.enable = z;
        this.replenishRegister = z2;
        this.delayTime = j;
        this.maxDelayTime = j2;
    }
}
