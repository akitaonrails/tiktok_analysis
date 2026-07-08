package com.bytedance.pipo.ttpay.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class TtpayLoadingConfig {

    @C09CT("lottie_url")
    public final String lottieUrl;

    @C09CT("secondary_loading_delay")
    public final Long secondaryLoadingDelayMs;

    @C09CT("timeout_duration")
    public final Long timeoutDurationMs;

    public TtpayLoadingConfig() {
        this(null, 3000L, 15000L);
    }

    public TtpayLoadingConfig(String str, Long l, Long l2) {
        this.lottieUrl = str;
        this.secondaryLoadingDelayMs = l;
        this.timeoutDurationMs = l2;
    }
}
