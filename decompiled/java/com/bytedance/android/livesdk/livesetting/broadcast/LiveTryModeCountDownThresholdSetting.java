package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "live_try_mode_count_down_threshold")
public final class LiveTryModeCountDownThresholdSetting {
    public static final int DEFAULT = 120;
    public static final LiveTryModeCountDownThresholdSetting INSTANCE = new LiveTryModeCountDownThresholdSetting();

    public final int threshold() {
        return SettingsManager.INSTANCE.getIntValue("live_try_mode_count_down_threshold", DEFAULT);
    }
}
