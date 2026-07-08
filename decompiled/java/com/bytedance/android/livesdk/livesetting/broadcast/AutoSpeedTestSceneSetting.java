package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "auto_speed_test_scene")
public final class AutoSpeedTestSceneSetting {
    public static final String DEFAULT = "tiktok_game_live_auto";
    public static final AutoSpeedTestSceneSetting INSTANCE = new AutoSpeedTestSceneSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("auto_speed_test_scene", DEFAULT);
    }
}
