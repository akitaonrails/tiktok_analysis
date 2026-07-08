package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_public_screen_ui_config_anchor_name_shadow")
public final class LivePublicScreenUiConfigAnchorNameShadowSetting {
    public static final LivePublicScreenUiConfigAnchorNameShadowSetting INSTANCE = new LivePublicScreenUiConfigAnchorNameShadowSetting();
    public static final PublicScreenShadowConfig DEFAULT = new PublicScreenShadowConfig();

    public final PublicScreenShadowConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        PublicScreenShadowConfig publicScreenShadowConfig = DEFAULT;
        PublicScreenShadowConfig publicScreenShadowConfig2 = (PublicScreenShadowConfig) settingsManager.getValueSafely("live_public_screen_ui_config_anchor_name_shadow", publicScreenShadowConfig);
        return publicScreenShadowConfig2 != null ? publicScreenShadowConfig2 : publicScreenShadowConfig;
    }
}
