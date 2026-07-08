package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_preview_panel_optimize_config")
public final class MultiGuestPreviewPanelOptimizeConfigSetting {
    public static final MultiGuestPreviewPanelOptimizeConfigSetting INSTANCE = new MultiGuestPreviewPanelOptimizeConfigSetting();
    public static final MultiGuestPreviewPanelOptimizeConfig DEFAULT = new MultiGuestPreviewPanelOptimizeConfig(false, false, false);

    private final MultiGuestPreviewPanelOptimizeConfig value() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        MultiGuestPreviewPanelOptimizeConfig multiGuestPreviewPanelOptimizeConfig = DEFAULT;
        MultiGuestPreviewPanelOptimizeConfig multiGuestPreviewPanelOptimizeConfig2 = (MultiGuestPreviewPanelOptimizeConfig) settingsManager.getValueSafely("multi_guest_preview_panel_optimize_config", multiGuestPreviewPanelOptimizeConfig);
        return multiGuestPreviewPanelOptimizeConfig2 != null ? multiGuestPreviewPanelOptimizeConfig2 : multiGuestPreviewPanelOptimizeConfig;
    }

    public final boolean enableShake() {
        return value().enableShake;
    }

    public final boolean enableVideoAudioMemory() {
        return value().enableVideoAudioMemory;
    }

    public final boolean removePreviewPanel() {
        return value().removeCountDownPreview;
    }
}
