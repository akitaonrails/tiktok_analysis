package com.ss.android.ugc.aweme.litemode;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class LiteModePushConfig {

    @C09CT("ban_by_cancel_times")
    public final int banByCancelTimes;

    @C09CT("ban_strategy_id")
    public final String banStrategyId;

    @C09CT("disable_push_by_temperature")
    public final int disablePushByTemperature;

    @C09CT("enable_precise_exp")
    public final int enablePreciseExp;

    @C09CT("freq_strategy_id")
    public final String freqStrategyId;

    @C09CT("plan_b_default_turn_on")
    public final int planBDefaultTurnOn;

    @C09CT("push_type")
    public final int pushPlan;

    @C09CT("show_push_by_bad_scroll")
    public final int showPushByBadScroll;

    public LiteModePushConfig() {
        this(0, null, null, 3, 0, 0, 0, 0);
    }

    public LiteModePushConfig(int i, String str, String str2, int i2, int i3, int i4, int i5, int i6) {
        this.pushPlan = i;
        this.freqStrategyId = str;
        this.banStrategyId = str2;
        this.banByCancelTimes = i2;
        this.showPushByBadScroll = i3;
        this.disablePushByTemperature = i4;
        this.planBDefaultTurnOn = i5;
        this.enablePreciseExp = i6;
    }
}
