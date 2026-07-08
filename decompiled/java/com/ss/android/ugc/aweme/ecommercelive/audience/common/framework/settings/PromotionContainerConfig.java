package com.ss.android.ugc.aweme.ecommercelive.audience.common.framework.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes18.dex */
public final class PromotionContainerConfig {

    @C09CT("show_delay")
    public final long delay;

    @C09CT("show_duration")
    public final long duration;

    @C09CT("empty_request_limit")
    public final int emptyRequestLimit;

    @C09CT("enable_container")
    public final boolean enable;

    @C09CT("show_interval")
    public final long interval;

    public PromotionContainerConfig() {
        this(true, 2000L, 4000L, 30000L, Integer.MAX_VALUE);
    }

    public PromotionContainerConfig(boolean z, long j, long j2, long j3, int i) {
        this.enable = z;
        this.delay = j;
        this.duration = j2;
        this.interval = j3;
        this.emptyRequestLimit = i;
    }
}
