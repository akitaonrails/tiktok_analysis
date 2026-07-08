package com.ss.android.ugc.tiktok.tools.performance.api.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes9.dex */
public final class DeferEnterAnimEndConfig {

    @C09CT("defer_time")
    public final long deferTime;

    @C09CT("defer_type")
    public final int deferType;

    public DeferEnterAnimEndConfig() {
        this(0, 400L);
    }

    public final long getDeferTime() {
        return this.deferTime;
    }

    public final int getDeferType() {
        return this.deferType;
    }

    public DeferEnterAnimEndConfig(int i, long j) {
        this.deferType = i;
        this.deferTime = j;
    }
}
