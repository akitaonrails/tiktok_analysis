package com.ss.android.ugc.aweme.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class StrategyConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("max_pull_time")
    public final int maxPullTime;

    @C09CT("min_pull_time")
    public final int minPullTime;

    @C09CT("threshold")
    public final double threshold;

    public StrategyConfig() {
        this(false, 0.0d, 20000, 5000);
    }

    public StrategyConfig(boolean z, double d, int i, int i2) {
        this.enable = z;
        this.threshold = d;
        this.maxPullTime = i;
        this.minPullTime = i2;
    }
}
