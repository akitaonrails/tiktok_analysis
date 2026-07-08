package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "watch_live_cpu_opt")
public final class LiveWatchCpuOptSetting {
    public static final LiveWatchCpuOptSetting INSTANCE = new LiveWatchCpuOptSetting();
    public static final PerfConfig DEFAULT = new PerfConfig(false, false);

    public static final boolean enableInflaterOpt() {
        return INSTANCE.getConfig().enableInflaterOpt;
    }

    public static final boolean enableMemOpt() {
        return INSTANCE.getConfig().enableMemClean;
    }

    private final PerfConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        PerfConfig perfConfig = DEFAULT;
        PerfConfig perfConfig2 = (PerfConfig) settingsManager.getValueSafely("watch_live_cpu_opt", perfConfig);
        return perfConfig2 != null ? perfConfig2 : perfConfig;
    }
}
