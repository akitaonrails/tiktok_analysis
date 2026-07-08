package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_take_the_stage_settlement_clock_duration")
public final class LiveCoHostTakeTheStageSettlementClockDurationSetting {
    public static final long DEFAULT = 3;
    public static final LiveCoHostTakeTheStageSettlementClockDurationSetting INSTANCE = new LiveCoHostTakeTheStageSettlementClockDurationSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_cohost_take_the_stage_settlement_clock_duration", DEFAULT);
    }
}
