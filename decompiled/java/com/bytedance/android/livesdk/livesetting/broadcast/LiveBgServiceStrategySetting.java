package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("ttlive_bg_service_strategy_setting")
public final class LiveBgServiceStrategySetting {
    public static final LiveBgServiceStrategySetting INSTANCE = new LiveBgServiceStrategySetting();
    public static final int DEFAULT = 29;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("ttlive_bg_service_strategy_setting", DEFAULT);
    }
}
