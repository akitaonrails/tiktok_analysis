package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_destroy_scatter_fallback_opt")
public final class LiveDestroyScatterFallbackOptSetting {
    public static final LiveDestroyScatterFallbackOptSetting INSTANCE = new LiveDestroyScatterFallbackOptSetting();
    public static final boolean DEFAULT = false;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_destroy_scatter_fallback_opt", DEFAULT);

    public final boolean enable() {
        return value;
    }
}
