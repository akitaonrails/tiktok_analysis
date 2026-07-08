package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlh_android_adaptive_config")
public final class TTLHAndroidAdaptiveConfig {
    public static final TTLHAndroidAdaptiveConfig INSTANCE = new TTLHAndroidAdaptiveConfig();
    public static final String DEFAULT = "{}";

    public final String value() {
        return SettingsManager.INSTANCE.getStringValue("ttlh_android_adaptive_config", DEFAULT);
    }
}
