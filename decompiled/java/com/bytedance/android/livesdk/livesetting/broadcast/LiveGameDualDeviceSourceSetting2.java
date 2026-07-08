package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_game_dual_device_camera_retry_duration_sec")
public final class LiveGameDualDeviceSourceSetting2 {
    public static final LiveGameDualDeviceSourceSetting2 INSTANCE = new LiveGameDualDeviceSourceSetting2();
    public static final float DEFAULT = 0.5f;

    public final float getRetryDuration() {
        return SettingsManager.INSTANCE.getFloatValue("live_game_dual_device_camera_retry_duration_sec", DEFAULT);
    }
}
