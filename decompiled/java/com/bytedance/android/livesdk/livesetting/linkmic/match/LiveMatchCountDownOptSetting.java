package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("gbl_match_countdown_optimize_config")
public final class LiveMatchCountDownOptSetting {
    public static final LiveMatchCountDownOptSetting INSTANCE = new LiveMatchCountDownOptSetting();
    public static final LiveMatchCountDownOptConfig DEFAULT = new LiveMatchCountDownOptConfig(false, 1000);

    private final LiveMatchCountDownOptConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveMatchCountDownOptConfig liveMatchCountDownOptConfig = DEFAULT;
        LiveMatchCountDownOptConfig liveMatchCountDownOptConfig2 = (LiveMatchCountDownOptConfig) settingsManager.getValueSafely("gbl_match_countdown_optimize_config", liveMatchCountDownOptConfig);
        return liveMatchCountDownOptConfig2 != null ? liveMatchCountDownOptConfig2 : liveMatchCountDownOptConfig;
    }

    public final long getRefreshIntervalMs() {
        return getConfig().refreshIntervalMs;
    }

    public final boolean isEnable() {
        return getConfig().enable;
    }
}
