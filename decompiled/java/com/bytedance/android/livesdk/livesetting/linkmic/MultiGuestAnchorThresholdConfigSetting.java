package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C1697810uHb;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_anchor_threshold_config")
public final class MultiGuestAnchorThresholdConfigSetting {
    public static final MultiGuestAnchorThresholdConfigSetting INSTANCE = new MultiGuestAnchorThresholdConfigSetting();
    public static final MultiGuestThresholdConfig DEFAULT = new MultiGuestThresholdConfig(C1697810uHb.LJIIJJI(1, 5, 10, 30, 50), 39999);

    private final MultiGuestThresholdConfig getSettingValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        MultiGuestThresholdConfig multiGuestThresholdConfig = DEFAULT;
        MultiGuestThresholdConfig multiGuestThresholdConfig2 = (MultiGuestThresholdConfig) settingsManager.getValueSafely("multi_guest_anchor_threshold_config", multiGuestThresholdConfig);
        return multiGuestThresholdConfig2 != null ? multiGuestThresholdConfig2 : multiGuestThresholdConfig;
    }

    public final int getMaxCoins() {
        return getSettingValue().maxCoins;
    }

    public final List<Integer> getOptions() {
        return getSettingValue().options;
    }
}
