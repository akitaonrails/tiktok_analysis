package com.ss.android.ugc.aweme.explore.monitor.net;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class ExploreSlardarEventMonitorSettings$EventConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("sample_rate")
    public final float sampleRate;

    public ExploreSlardarEventMonitorSettings$EventConfig() {
        this(false, 0.0f);
    }

    public ExploreSlardarEventMonitorSettings$EventConfig(boolean z, float f) {
        this.enable = z;
        this.sampleRate = f;
    }
}
