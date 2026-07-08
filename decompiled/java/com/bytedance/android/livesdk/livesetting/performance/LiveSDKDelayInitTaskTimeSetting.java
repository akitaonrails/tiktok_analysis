package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("livesdk_delay_init_task_time")
public final class LiveSDKDelayInitTaskTimeSetting {
    public static final int $stable = 0;
    public static final int DEFAULT = 30;
    public static final LiveSDKDelayInitTaskTimeSetting INSTANCE = new LiveSDKDelayInitTaskTimeSetting();

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("livesdk_delay_init_task_time", DEFAULT);
    }
}
