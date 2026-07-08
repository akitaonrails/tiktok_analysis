package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_infeed_skylight_opt")
public final class LiveInfeedSkylightOptSetting {
    public static final LiveInfeedSkylightOptSetting INSTANCE = new LiveInfeedSkylightOptSetting();
    public static final InfeedSkylightConfig DEFAULT = new InfeedSkylightConfig();

    public static final boolean disableAnim() {
        return INSTANCE.getValue().disableAnim;
    }

    public static final long refreshInterval() {
        return INSTANCE.getValue().refreshInterval;
    }

    public final InfeedSkylightConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        InfeedSkylightConfig infeedSkylightConfig = DEFAULT;
        InfeedSkylightConfig infeedSkylightConfig2 = (InfeedSkylightConfig) settingsManager.getValueSafely("live_infeed_skylight_opt", infeedSkylightConfig);
        return infeedSkylightConfig2 != null ? infeedSkylightConfig2 : infeedSkylightConfig;
    }
}
