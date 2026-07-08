package com.ss.android.ugc.aweme.im.common.setting;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class ActivityStatusInAppPushCTROptConfig {

    @C09CT("enable_in_chat_room_strategy")
    public final boolean enableInChatRoomStrategy;

    @C09CT("enable_low_consumption_strategy")
    public final boolean enableLowConsumptionStrategy;

    @C09CT("enable_send_message_frequency_strategy")
    public final boolean enableSendMessageFrequencyStrategy;

    @C09CT("low_consumption_avoid_days")
    public final int lowConsumptionAvoidDays;

    @C09CT("low_consumption_check_day_range")
    public final int lowConsumptionCheckDayRange;

    @C09CT("low_consumption_click_threshold_times")
    public final int lowConsumptionClickThresholdTimes;

    @C09CT("low_consumption_show_threshold_times")
    public final int lowConsumptionShowThresholdTimes;

    @C09CT("low_consumption_strategy_version")
    public final long lowConsumptionStrategyVersion;

    @C09CT("send_message_frequency_threshold")
    public final long sendMessageFrequencyThreshold;

    public ActivityStatusInAppPushCTROptConfig() {
        this(false, false, false, 600000L, 3, 3, 3, 3, 0L);
    }

    public ActivityStatusInAppPushCTROptConfig(boolean z, boolean z2, boolean z3, long j, int i, int i2, int i3, int i4, long j2) {
        this.enableInChatRoomStrategy = z;
        this.enableSendMessageFrequencyStrategy = z2;
        this.enableLowConsumptionStrategy = z3;
        this.sendMessageFrequencyThreshold = j;
        this.lowConsumptionCheckDayRange = i;
        this.lowConsumptionShowThresholdTimes = i2;
        this.lowConsumptionClickThresholdTimes = i3;
        this.lowConsumptionAvoidDays = i4;
        this.lowConsumptionStrategyVersion = j2;
    }
}
