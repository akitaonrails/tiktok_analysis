package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlh_android_adaptive_ab_config")
public final class TTLHAndroidAdaptiveABConfig {
    public static final TTLHAndroidAdaptiveABConfig INSTANCE = new TTLHAndroidAdaptiveABConfig();
    public static final String DEFAULT = "";

    public final String value() {
        return SettingsManager.INSTANCE.getStringValue("ttlh_android_adaptive_ab_config", DEFAULT);
    }
}
