package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_image_monitor_scene")
public final class LiveImageMonitorSceneSetting {
    public static final LiveImageMonitorSceneSetting INSTANCE = new LiveImageMonitorSceneSetting();
    public static final String[] DEFAULT = new String[0];

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("live_image_monitor_scene", DEFAULT);
    }
}
