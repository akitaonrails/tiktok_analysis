package com.ss.android.ugc.aweme.im.lightinteract.impl.autofetch;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class LightInteractionAutoRetryConfig {

    @C09CT("min_interval_seconds")
    public final int minIntervalSeconds;

    @C09CT("minutes")
    public final int minutes;

    @C09CT("times")
    public final int times;

    public LightInteractionAutoRetryConfig() {
        this(5, 3, 60);
    }

    public LightInteractionAutoRetryConfig(int i, int i2, int i3) {
        this.minutes = i;
        this.times = i2;
        this.minIntervalSeconds = i3;
    }
}
