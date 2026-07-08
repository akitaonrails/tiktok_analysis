package com.bytedance.android.starship.strategy.option;

import X.C09CT;

/* JADX INFO: loaded from: classes21.dex */
public final class StrategyStabilityConfig {

    @C09CT("allow_cold_start")
    public final boolean allowColdStart;

    @C09CT("location")
    public final int location;

    @C09CT("name")
    public final String name;

    @C09CT("option")
    public final int option;

    @C09CT("params")
    public final String params;

    public StrategyStabilityConfig(String str, int i, String str2, int i2, boolean z) {
        this.name = str;
        this.option = i;
        this.params = str2;
        this.location = i2;
        this.allowColdStart = z;
    }
}
