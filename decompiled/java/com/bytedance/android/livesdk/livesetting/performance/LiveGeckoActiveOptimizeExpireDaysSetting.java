package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_gecko_active_optimize_expire_days")
public final class LiveGeckoActiveOptimizeExpireDaysSetting {
    public static final LiveGeckoActiveOptimizeExpireDaysSetting INSTANCE = new LiveGeckoActiveOptimizeExpireDaysSetting();
    public static final int DEFAULT = 30;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_gecko_active_optimize_expire_days", DEFAULT);
    }
}
