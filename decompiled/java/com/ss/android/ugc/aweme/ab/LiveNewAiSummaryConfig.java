package com.ss.android.ugc.aweme.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveNewAiSummaryConfig {

    @C09CT("live_ai_summary_delay_show_interval")
    public final long delayShowInterval;

    @C09CT("live_ai_summary_design_style")
    public final int designType;

    @C09CT("enable_live_ai_summary")
    public final boolean enable;

    @C09CT("live_ai_summary_show_duration")
    public final int showDuration;

    public LiveNewAiSummaryConfig() {
        this(false, 1000L, 0, 10);
    }

    public LiveNewAiSummaryConfig(boolean z, long j, int i, int i2) {
        this.enable = z;
        this.delayShowInterval = j;
        this.designType = i;
        this.showDuration = i2;
    }
}
