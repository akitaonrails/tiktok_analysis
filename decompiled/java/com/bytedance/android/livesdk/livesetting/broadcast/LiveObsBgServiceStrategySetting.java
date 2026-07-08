package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("ttlive_obs_bg_service_strategy_setting")
public final class LiveObsBgServiceStrategySetting {
    public static final LiveObsBgServiceStrategySetting INSTANCE = new LiveObsBgServiceStrategySetting();
    public static final int DEFAULT = 34;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("ttlive_obs_bg_service_strategy_setting", DEFAULT);
    }
}
