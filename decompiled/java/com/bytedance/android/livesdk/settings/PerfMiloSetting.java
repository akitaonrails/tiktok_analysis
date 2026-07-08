package com.bytedance.android.livesdk.settings;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("perf_milo_receiver_setting")
public final class PerfMiloSetting {
    public static final boolean DEFAULT = false;
    public static final PerfMiloSetting INSTANCE = new PerfMiloSetting();
    public static final boolean V1 = true;

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("perf_milo_receiver_setting", DEFAULT);
    }
}
