package com.bytedance.android.livesdk.livesetting.watchlive.previewlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_enable_delete_card_compensate")
public final class LiveEnableDeleteCardCompensateSetting {
    public static final LiveEnableDeleteCardCompensateSetting INSTANCE = new LiveEnableDeleteCardCompensateSetting();
    public static final CompensateConfig DEFAULT = new CompensateConfig(false, false, false);

    public final CompensateConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        CompensateConfig compensateConfig = DEFAULT;
        CompensateConfig compensateConfig2 = (CompensateConfig) settingsManager.getValueSafely("live_enable_delete_card_compensate", compensateConfig);
        return compensateConfig2 != null ? compensateConfig2 : compensateConfig;
    }

    public final boolean enableClient() {
        return getValue().enableClient;
    }

    public final boolean enableServer() {
        return getValue().enableServer;
    }

    public final boolean feedRequestOpt() {
        return getValue().feedRequestOpt;
    }
}
