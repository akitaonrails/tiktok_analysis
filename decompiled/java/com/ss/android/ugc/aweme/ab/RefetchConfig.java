package com.ss.android.ugc.aweme.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class RefetchConfig {

    @C09CT("interval_ms")
    public final Long interval;

    @C09CT("num_repeat")
    public final Integer numRepeat;

    @C09CT("opt_out_pending_store_expiry")
    public final Long optOutPendingStoreExpiry;

    public RefetchConfig(Integer num, Long l, Long l2) {
        this.numRepeat = num;
        this.interval = l;
        this.optOutPendingStoreExpiry = l2;
    }
}
