package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_public_screen_ui_config_anchor_badge")
public final class LivePublicScreenUiConfigAnchorBadgeSetting {
    public static final LivePublicScreenUiConfigAnchorBadgeSetting INSTANCE = new LivePublicScreenUiConfigAnchorBadgeSetting();
    public static final PublicScreenBadgeConfig DEFAULT = new PublicScreenBadgeConfig();

    public final PublicScreenBadgeConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        PublicScreenBadgeConfig publicScreenBadgeConfig = DEFAULT;
        PublicScreenBadgeConfig publicScreenBadgeConfig2 = (PublicScreenBadgeConfig) settingsManager.getValueSafely("live_public_screen_ui_config_anchor_badge", publicScreenBadgeConfig);
        return publicScreenBadgeConfig2 != null ? publicScreenBadgeConfig2 : publicScreenBadgeConfig;
    }
}
