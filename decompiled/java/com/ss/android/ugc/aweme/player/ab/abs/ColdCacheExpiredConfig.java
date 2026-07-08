package com.ss.android.ugc.aweme.player.ab.abs;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class ColdCacheExpiredConfig {

    @C09CT("check_expired_in_advance_time_h")
    public final int checkExpiredInAdvanceTimeH;

    @C09CT("check_expired_in_cold_time_h")
    public final int checkExpiredInColdUseTimeH;

    @C09CT("check_expired_in_unconsumed_time_h")
    public final int checkExpiredInUnconsumedUseTimeH;

    @C09CT("enable_strategy")
    public final boolean enableStrategy;

    public ColdCacheExpiredConfig() {
        this(false, -1, -1, -1);
    }

    public ColdCacheExpiredConfig(boolean z, int i, int i2, int i3) {
        this.enableStrategy = z;
        this.checkExpiredInAdvanceTimeH = i;
        this.checkExpiredInColdUseTimeH = i2;
        this.checkExpiredInUnconsumedUseTimeH = i3;
    }
}
