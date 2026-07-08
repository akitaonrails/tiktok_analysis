package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_host_c2pa_check_config")
public final class LiveHostC2PACheckSettings {
    public static final int DEFAULT = 0;
    public static final LiveHostC2PACheckSettings INSTANCE = new LiveHostC2PACheckSettings();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("live_host_c2pa_check_config", DEFAULT) == 1;
    }
}
