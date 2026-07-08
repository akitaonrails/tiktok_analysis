package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_gecko_optimize_with_cep_expire_days")
public final class LiveGeckoOptimizeWithCepExpireDaysSetting {
    public static final LiveGeckoOptimizeWithCepExpireDaysSetting INSTANCE = new LiveGeckoOptimizeWithCepExpireDaysSetting();
    public static final int DEFAULT = 30;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_gecko_optimize_with_cep_expire_days", DEFAULT);
    }
}
