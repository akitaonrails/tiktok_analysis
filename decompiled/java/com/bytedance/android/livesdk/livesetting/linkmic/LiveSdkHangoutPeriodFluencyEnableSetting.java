package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_hangout_period_fluency_enable")
public final class LiveSdkHangoutPeriodFluencyEnableSetting {
    public static final int DEFAULT = 1;
    public static final LiveSdkHangoutPeriodFluencyEnableSetting INSTANCE = new LiveSdkHangoutPeriodFluencyEnableSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getIntValue("live_sdk_hangout_period_fluency_enable", DEFAULT) == 1;
    }
}
