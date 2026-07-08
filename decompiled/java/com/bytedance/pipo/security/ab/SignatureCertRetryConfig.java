package com.bytedance.pipo.security.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class SignatureCertRetryConfig {

    @C09CT("retry_interval")
    public final int retryInterval;

    @C09CT("retry_times")
    public final int retryTimes;

    public SignatureCertRetryConfig() {
        this(0, 0);
    }

    public SignatureCertRetryConfig(int i, int i2) {
        this.retryTimes = i;
        this.retryInterval = i2;
    }
}
