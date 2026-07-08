package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_public_screen_ui_config_adaptive_line_height")
public final class LivePublicScreenUiConfigAdaptiveLineHeightSetting {
    public static final boolean DEFAULT = false;
    public static final LivePublicScreenUiConfigAdaptiveLineHeightSetting INSTANCE = new LivePublicScreenUiConfigAdaptiveLineHeightSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_public_screen_ui_config_adaptive_line_height", DEFAULT);
    }
}
