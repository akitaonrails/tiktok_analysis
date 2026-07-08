package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "restart_live_setting")
public final class RestartLiveSetting {
    public static final RestartLiveSetting INSTANCE = new RestartLiveSetting();
    public static final RestartLiveConfig DEFAULT = new RestartLiveConfig(false, false, 15000, 50, 8, "10,15", 300000, 4);

    public final RestartLiveConfig getConfig() {
        return (RestartLiveConfig) SettingsManager.INSTANCE.getValueSafely("restart_live_setting", DEFAULT);
    }
}
