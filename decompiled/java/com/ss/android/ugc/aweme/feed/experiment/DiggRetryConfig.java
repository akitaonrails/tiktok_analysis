package com.ss.android.ugc.aweme.feed.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class DiggRetryConfig {

    @C09CT("retry_count")
    public final int retryCount;

    @C09CT("timeout_second")
    public final long timeoutSecond;

    public DiggRetryConfig() {
        this(0, -1L);
    }

    public DiggRetryConfig(int i, long j) {
        this.retryCount = i;
        this.timeoutSecond = j;
    }
}
