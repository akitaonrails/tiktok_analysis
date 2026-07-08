package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_host_preview_power_cache_interval")
public final class LiveHostPreviewPowerCacheInterval {
    public static final LiveHostPreviewPowerCacheInterval INSTANCE = new LiveHostPreviewPowerCacheInterval();
    public static final int DEFAULT = 8;
    public static final int value = SettingsManager.INSTANCE.getIntValue("live_host_preview_power_cache_interval", 8);

    public static /* synthetic */ void getValue$annotations() {
    }

    public static final int getValue() {
        return value;
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }
}
