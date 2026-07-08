package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "host_add_location_distance_config")
public final class HostAddLocationDistanceConfigSetting {
    public static final HostAddLocationDistanceConfigSetting INSTANCE = new HostAddLocationDistanceConfigSetting();
    public static final int DEFAULT = 15;
    public static final int value = SettingsManager.INSTANCE.getIntValue("host_add_location_distance_config", DEFAULT);

    public final int getValue() {
        return value;
    }
}
