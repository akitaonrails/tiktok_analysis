package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class CaptionLazyLoadStrategyConfig {

    @C09CT("estimated_load_time")
    public final long triggerLoadAhead;

    public CaptionLazyLoadStrategyConfig() {
        this(-1L);
    }

    public CaptionLazyLoadStrategyConfig(long j) {
        this.triggerLoadAhead = j;
    }
}
