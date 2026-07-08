package com.ss.android.ugc.aweme.vibefeed.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class SharedFeedExitStrategyConfig {

    @C09CT("auto_re_entrance_days")
    public final int autoReEntranceDays;

    @C09CT("auto_re_entrance_enabled")
    public final boolean autoReEntranceEnabled;

    @C09CT("click_re_entrance_enabled")
    public final boolean clickReEntranceEnabled;

    @C09CT("enable_impression_limit_control")
    public final boolean enableImpressionLimitControl;

    @C09CT("enable_realtime_expose_limit")
    public final boolean enableRealtimeExposeLimit;

    @C09CT("expose_impression_limit")
    public final int exposeImpressionLimit;

    public SharedFeedExitStrategyConfig() {
        this(false, 8, false, false, 14, true);
    }

    public SharedFeedExitStrategyConfig(boolean z, int i, boolean z2, boolean z3, int i2, boolean z4) {
        this.enableImpressionLimitControl = z;
        this.exposeImpressionLimit = i;
        this.clickReEntranceEnabled = z2;
        this.autoReEntranceEnabled = z3;
        this.autoReEntranceDays = i2;
        this.enableRealtimeExposeLimit = z4;
    }
}
