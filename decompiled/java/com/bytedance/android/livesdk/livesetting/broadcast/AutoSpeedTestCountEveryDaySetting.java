package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "auto_speed_test_count_every_day")
public final class AutoSpeedTestCountEveryDaySetting {
    public static final int DEFAULT = 0;
    public static final AutoSpeedTestCountEveryDaySetting INSTANCE = new AutoSpeedTestCountEveryDaySetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("auto_speed_test_count_every_day", DEFAULT);
    }
}
