package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_batch_release_opt")
public final class LiveSlideFluencyOptSetting {
    public static final LiveSlideFluencyOptSetting INSTANCE = new LiveSlideFluencyOptSetting();
    public static final BatchConfig DEFAULT = new BatchConfig(false, false, 50, false);

    public static final boolean enablePullOpt() {
        return INSTANCE.getConfig().enablePullOpt;
    }

    public static final boolean enableReleaseLinkOpt() {
        return INSTANCE.getConfig().enableReleaseLinkOpt;
    }

    public static final long getBatchMs() {
        return INSTANCE.getConfig().batchMs;
    }

    private final BatchConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        BatchConfig batchConfig = DEFAULT;
        BatchConfig batchConfig2 = (BatchConfig) settingsManager.getValueSafely("live_batch_release_opt", batchConfig);
        return batchConfig2 != null ? batchConfig2 : batchConfig;
    }
}
