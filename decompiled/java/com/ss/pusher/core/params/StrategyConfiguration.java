package com.ss.pusher.core.params;

import X.C09CT;

/* JADX INFO: loaded from: classes21.dex */
public final class StrategyConfiguration {

    @C09CT("enablePlatformLayerDropFrame")
    public final boolean dropEncodeFps;

    @C09CT("onlyUsePerfStrategy")
    public final boolean onlyUsePerfStrategy;

    @C09CT("strategyInputType")
    public final int strategyInputType;

    @C09CT("strategyInterval")
    public final int strategyInterval;

    public StrategyConfiguration() {
        this(1, true, 5, false);
    }

    public StrategyConfiguration(int i, boolean z, int i2, boolean z2) {
        this.strategyInputType = i;
        this.dropEncodeFps = z;
        this.strategyInterval = i2;
        this.onlyUsePerfStrategy = z2;
    }
}
