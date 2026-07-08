package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_core_camera_log_level")
public final class LiveCoreCameraLogLevelSetting {
    public static final int DEFAULT = 0;
    public static final LiveCoreCameraLogLevelSetting INSTANCE = new LiveCoreCameraLogLevelSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_core_camera_log_level", DEFAULT);
    }
}
