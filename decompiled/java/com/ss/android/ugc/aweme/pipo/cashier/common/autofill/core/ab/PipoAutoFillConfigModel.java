package com.ss.android.ugc.aweme.pipo.cashier.common.autofill.core.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoAutoFillConfigModel {

    @C09CT("enabled")
    public final int enabled;

    @C09CT("expiration_limit")
    public final long expirationLimit;

    @C09CT("max_retry_time")
    public final int maxRetryTime;

    @C09CT("preload_enable")
    public final int preloadEnable;

    public PipoAutoFillConfigModel() {
        this(1, 3, 0, 600000L);
    }

    public PipoAutoFillConfigModel(int i, int i2, int i3, long j) {
        this.enabled = i;
        this.maxRetryTime = i2;
        this.preloadEnable = i3;
        this.expirationLimit = j;
    }
}
