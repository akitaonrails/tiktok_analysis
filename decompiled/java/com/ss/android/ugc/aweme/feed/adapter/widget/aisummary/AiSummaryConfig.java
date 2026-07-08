package com.ss.android.ugc.aweme.feed.adapter.widget.aisummary;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class AiSummaryConfig {

    @C09CT("enable_live_ai_summary")
    public final boolean enable;

    @C09CT("live_ai_summary_no_marquee")
    public final int noNeedMarquee;

    @C09CT("live_ai_summary_no_update")
    public final int noUpdate;

    @C09CT("live_ai_summary_opt_load_time")
    public final int optWidgetLoadTime;

    @C09CT("live_ai_summary_delay_time")
    public final long showDelayTime;

    @C09CT("live_ai_summary_style")
    public final int style;

    public AiSummaryConfig() {
        this(false, 0, 0L, 0, 0, 0);
    }

    public AiSummaryConfig(boolean z, int i, long j, int i2, int i3, int i4) {
        this.enable = z;
        this.style = i;
        this.showDelayTime = j;
        this.noUpdate = i2;
        this.noNeedMarquee = i3;
        this.optWidgetLoadTime = i4;
    }
}
