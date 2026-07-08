package com.ss.android.ugc.aweme.outreach.frequency.config;

import X.C09CT;

/* JADX INFO: loaded from: classes32.dex */
public final class UploadRecordConfig {

    @C09CT("min_interval")
    public final int minInterval;

    @C09CT("retry_times")
    public final int retryTimes;

    public UploadRecordConfig() {
        this(3, 2);
    }

    public UploadRecordConfig(int i, int i2) {
        this.minInterval = i;
        this.retryTimes = i2;
    }
}
