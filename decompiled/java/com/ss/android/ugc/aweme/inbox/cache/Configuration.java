package com.ss.android.ugc.aweme.inbox.cache;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class Configuration {
    public static final int $stable = 0;

    @C09CT("boot_delay_time")
    public final long bootFinishDelayTime;

    public Configuration() {
        this(8000L);
    }

    public Configuration(long j) {
        this.bootFinishDelayTime = j;
    }
}
