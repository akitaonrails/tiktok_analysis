package com.bytedance.android.livesdk.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("perf_use_apm_fluency_setting")
public final class PerfUseApmFluencySetting {
    public static final PerfUseApmFluencySetting INSTANCE = new PerfUseApmFluencySetting();
    public static final boolean DEFAULT = false;
    public static final boolean enable = SettingsManager.INSTANCE.getBooleanValue("perf_use_apm_fluency_setting", DEFAULT);

    public static /* synthetic */ void getEnable$annotations() {
    }

    public static final boolean getEnable() {
        return enable;
    }
}
