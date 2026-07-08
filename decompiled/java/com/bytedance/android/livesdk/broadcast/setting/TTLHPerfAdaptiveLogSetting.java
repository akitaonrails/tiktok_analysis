package com.bytedance.android.livesdk.broadcast.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlh_perf_adaptive_log_enable")
public final class TTLHPerfAdaptiveLogSetting {
    public static final boolean DEFAULT = true;
    public static final TTLHPerfAdaptiveLogSetting INSTANCE = new TTLHPerfAdaptiveLogSetting();

    public final boolean enabled() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlh_perf_adaptive_log_enable", DEFAULT);
    }
}
