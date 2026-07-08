package com.ss.android.ugc.aweme.effectcreator.experiments;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class AmeLaunchConfig {

    @C09CT("enable")
    public final boolean isEnabled;

    @C09CT("launch_loading_delay_millis")
    public final long loadingDelayMillis;

    public AmeLaunchConfig() {
        this(false, 3000L);
    }

    public AmeLaunchConfig(boolean z, long j) {
        this.isEnabled = z;
        this.loadingDelayMillis = j;
    }
}
