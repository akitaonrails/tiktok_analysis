package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "manual_speed_test_scene")
public final class ManualSpeedTestSceneSetting {
    public static final String DEFAULT = "tiktok_game_live_manual";
    public static final ManualSpeedTestSceneSetting INSTANCE = new ManualSpeedTestSceneSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("manual_speed_test_scene", DEFAULT);
    }
}
