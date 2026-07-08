package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_fluency_period_duration")
public final class LiveFluencyPeriodDurationSetting {
    public static final long DEFAULT = 3000;
    public static final LiveFluencyPeriodDurationSetting INSTANCE = new LiveFluencyPeriodDurationSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_fluency_period_duration", DEFAULT);
    }
}
