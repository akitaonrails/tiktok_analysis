package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("ttec_live_small_window_config")
public final class LiveInnerWindowConfig {
    public static final LiveInnerWindowConfig INSTANCE = new LiveInnerWindowConfig();
    public static final WindowConfig DEFAULT = new WindowConfig(null, null);

    public final WindowConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        WindowConfig windowConfig = DEFAULT;
        WindowConfig windowConfig2 = (WindowConfig) settingsManager.getValueSafely("ttec_live_small_window_config", windowConfig);
        return windowConfig2 != null ? windowConfig2 : windowConfig;
    }
}
