package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_try_mode_count_down_duration")
public final class LiveTryModeCountDownDurationSetting {
    public static final int DEFAULT = 5;
    public static final LiveTryModeCountDownDurationSetting INSTANCE = new LiveTryModeCountDownDurationSetting();

    public final int duration() {
        return SettingsManager.INSTANCE.getIntValue("live_try_mode_count_down_duration", DEFAULT);
    }
}
