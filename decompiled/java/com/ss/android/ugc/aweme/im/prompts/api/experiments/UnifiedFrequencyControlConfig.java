package com.ss.android.ugc.aweme.im.prompts.api.experiments;

import X.C09CT;

/* JADX INFO: loaded from: classes3.dex */
public final class UnifiedFrequencyControlConfig {

    @C09CT("enabled")
    public final boolean isEnabled;

    @C09CT("last_x_messages_window")
    public final int lastXMessagesCount;

    @C09CT("p2_prompt_daily_count_limit")
    public final int p2DailyLimit;

    @C09CT("p2_prompt_show_interval_seconds")
    public final int p2IntervalTime;

    @C09CT("p3_prompt_daily_count_limit")
    public final int p3DailyLimit;

    @C09CT("p3_prompt_show_interval_seconds")
    public final int p3IntervalTime;

    public UnifiedFrequencyControlConfig() {
        this(false, 0, 0, 0, 0, 0);
    }

    public UnifiedFrequencyControlConfig(boolean z, int i, int i2, int i3, int i4, int i5) {
        this.isEnabled = z;
        this.p2IntervalTime = i;
        this.p3IntervalTime = i2;
        this.p2DailyLimit = i3;
        this.p3DailyLimit = i4;
        this.lastXMessagesCount = i5;
    }
}
