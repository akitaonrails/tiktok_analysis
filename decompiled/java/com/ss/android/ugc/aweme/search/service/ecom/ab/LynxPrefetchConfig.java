package com.ss.android.ugc.aweme.search.service.ecom.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class LynxPrefetchConfig {

    @C09CT("delay_time")
    public final long delayTime;

    @C09CT("enable_single_thread")
    public final boolean enableSingleThread;

    @C09CT("enable_pre_load")
    public final boolean enable_pre_load;

    @C09CT("pre_create_bullet")
    public final boolean preCreateBullet;

    @C09CT("pre_offset")
    public final int preOffset;

    @C09CT("prefetch_after_first_load")
    public final boolean prefetchAfterFirst;

    @C09CT("prefetch_in_scroll")
    public final boolean prefetchInScroll;

    public LynxPrefetchConfig() {
        this(false, false, false, 0L, false, 8, false);
    }

    public LynxPrefetchConfig(boolean z, boolean z2, boolean z3, long j, boolean z4, int i, boolean z5) {
        this.enable_pre_load = z;
        this.prefetchAfterFirst = z2;
        this.prefetchInScroll = z3;
        this.delayTime = j;
        this.preCreateBullet = z4;
        this.preOffset = i;
        this.enableSingleThread = z5;
    }
}
