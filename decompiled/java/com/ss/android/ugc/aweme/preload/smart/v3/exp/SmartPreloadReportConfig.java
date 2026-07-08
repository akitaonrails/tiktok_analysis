package com.ss.android.ugc.aweme.preload.smart.v3.exp;

import X.C09CT;

/* JADX INFO: loaded from: classes35.dex */
public final class SmartPreloadReportConfig {
    public static final int $stable = 8;

    @C09CT("enable")
    public boolean enable;

    @C09CT("run_rate")
    public float runRate;

    public final boolean getEnable() {
        return this.enable;
    }

    public final float getRunRate() {
        return this.runRate;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setRunRate(float f) {
        this.runRate = f;
    }
}
