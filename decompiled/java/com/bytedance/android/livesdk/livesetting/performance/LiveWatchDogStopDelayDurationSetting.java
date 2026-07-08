package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_watchdog_stop_delay_duration")
public final class LiveWatchDogStopDelayDurationSetting {
    public static final LiveWatchDogStopDelayDurationSetting INSTANCE = new LiveWatchDogStopDelayDurationSetting();
    public static final long DEFAULT = 10000;

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_watchdog_stop_delay_duration", DEFAULT);
    }
}
