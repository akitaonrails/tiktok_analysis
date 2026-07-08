package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_all_mode_interval_drop")
public final class LiveAllModePingIntervalDropSetting {
    public static final LiveAllModePingIntervalDropSetting INSTANCE = new LiveAllModePingIntervalDropSetting();
    public static final int DEFAULT = 0;
    public static int value = SettingsManager.INSTANCE.getIntValue("live_all_mode_interval_drop", DEFAULT);

    public final boolean enableGameMode() {
        return value > 1;
    }

    public final boolean isEnable() {
        return value > 0;
    }
}
