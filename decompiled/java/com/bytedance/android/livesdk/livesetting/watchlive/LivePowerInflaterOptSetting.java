package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_inflater_pwr_opt")
public final class LivePowerInflaterOptSetting {
    public static final LivePowerInflaterOptSetting INSTANCE = new LivePowerInflaterOptSetting();
    public static final InflateConfig DEFAULT = new InflateConfig(false, false, false);

    public static final boolean enable() {
        return INSTANCE.getConfig().enable;
    }

    public static final boolean enableGcBlockOpt() {
        return INSTANCE.getConfig().enableGcBlockOpt;
    }

    public static final boolean enlargeCapacity() {
        return INSTANCE.getConfig().enlargeCapacity;
    }

    private final InflateConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        InflateConfig inflateConfig = DEFAULT;
        InflateConfig inflateConfig2 = (InflateConfig) settingsManager.getValueSafely("live_inflater_pwr_opt", inflateConfig);
        return inflateConfig2 != null ? inflateConfig2 : inflateConfig;
    }
}
