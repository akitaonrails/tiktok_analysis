package com.ss.android.ugc.aweme.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class RetryConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("interval")
    public final int interval;

    @C09CT("retry_max_count")
    public final int retryMaxCount;

    public RetryConfig() {
        this(false, 3, 30);
    }

    public RetryConfig(boolean z, int i, int i2) {
        this.enable = z;
        this.retryMaxCount = i;
        this.interval = i2;
    }
}
