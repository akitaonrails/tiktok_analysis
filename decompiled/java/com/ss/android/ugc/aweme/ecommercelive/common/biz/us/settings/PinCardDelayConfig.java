package com.ss.android.ugc.aweme.ecommercelive.common.biz.us.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class PinCardDelayConfig {

    @C09CT("delay_time")
    public final long delay;

    @C09CT("delay_product_only")
    public final boolean delayProductOnly;

    public PinCardDelayConfig() {
        this(0L, true);
    }

    public PinCardDelayConfig(long j, boolean z) {
        this.delay = j;
        this.delayProductOnly = z;
    }
}
