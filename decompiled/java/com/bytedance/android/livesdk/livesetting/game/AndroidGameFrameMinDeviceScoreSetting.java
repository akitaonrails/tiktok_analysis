package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "android_game_frame_min_device_score")
public final class AndroidGameFrameMinDeviceScoreSetting {
    public static final float DEFAULT = 100.0f;
    public static final AndroidGameFrameMinDeviceScoreSetting INSTANCE = new AndroidGameFrameMinDeviceScoreSetting();

    public final float getValue() {
        return SettingsManager.INSTANCE.getFloatValue("android_game_frame_min_device_score", DEFAULT);
    }
}
