package com.ss.android.ugc.aweme.preload.smart.v3.exp;

import X.C09CT;

/* JADX INFO: loaded from: classes35.dex */
public final class SmartPreloadControlConfig {
    public static final int $stable = 8;

    @C09CT("only_in_wifi")
    public boolean onlyInWifi = true;

    public final boolean getOnlyInWifi() {
        return this.onlyInWifi;
    }

    public final void setOnlyInWifi(boolean z) {
        this.onlyInWifi = z;
    }
}
