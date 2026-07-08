package com.bytedance.pumbaa.userinput;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class ComponentConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("time_limit_ms")
    public final int timeLimitMs;

    public ComponentConfig() {
        this(false, 5000);
    }

    public ComponentConfig(boolean z, int i) {
        this.enable = z;
        this.timeLimitMs = i;
    }
}
