package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_max_enter_background_time")
public final class LiveMaxEnterBackgroundTimeSetting {
    public static final int DEFAULT = 60000;
    public static final LiveMaxEnterBackgroundTimeSetting INSTANCE = new LiveMaxEnterBackgroundTimeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_max_enter_background_time", DEFAULT);
    }
}
