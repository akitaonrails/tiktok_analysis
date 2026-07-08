package com.bytedance.pumbaa.hybrid.rasp.api;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class NavigationConfig {

    @C09CT("enable")
    public boolean enable;

    @C09CT("enable_rasp")
    public final boolean enableRasp;

    public NavigationConfig() {
        this(false, false);
    }

    public NavigationConfig(boolean z, boolean z2) {
        this.enable = z;
        this.enableRasp = z2;
    }
}
