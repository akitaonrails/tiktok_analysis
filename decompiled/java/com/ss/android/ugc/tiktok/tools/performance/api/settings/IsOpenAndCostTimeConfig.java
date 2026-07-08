package com.ss.android.ugc.tiktok.tools.performance.api.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class IsOpenAndCostTimeConfig {

    @C09CT("cost_time")
    public final int costTime;

    @C09CT("is_open")
    public final boolean isOpen;

    public IsOpenAndCostTimeConfig() {
        this(false, 0);
    }

    public IsOpenAndCostTimeConfig(boolean z, int i) {
        this.isOpen = z;
        this.costTime = i;
    }
}
