package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_singling_system_cache_size")
public final class LiveSinglingSystemCacheSizeSetting {
    public static final int DEFAULT = 70;
    public static final LiveSinglingSystemCacheSizeSetting INSTANCE = new LiveSinglingSystemCacheSizeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_singling_system_cache_size", DEFAULT);
    }
}
