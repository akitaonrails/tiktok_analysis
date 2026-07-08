package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("broadcast_new_stable_mode_setting")
public final class BroadcastNewStableModeSetting {
    public static final BroadcastNewStableModeSetting INSTANCE = new BroadcastNewStableModeSetting();
    public static final NewStableModeConfig DEFAULT = new NewStableModeConfig();

    public final NewStableModeConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        NewStableModeConfig newStableModeConfig = DEFAULT;
        NewStableModeConfig newStableModeConfig2 = (NewStableModeConfig) settingsManager.getValueSafely("broadcast_new_stable_mode_setting", newStableModeConfig);
        return newStableModeConfig2 != null ? newStableModeConfig2 : newStableModeConfig;
    }

    public final long delayInitMs() {
        return getConfig().delayInitMs;
    }

    public final boolean enable() {
        return getConfig().enable;
    }

    public final int functionAvailableMask() {
        return getConfig().functionAvailableMask;
    }

    public final int heavyThreshold() {
        return getConfig().heavyThreshold;
    }

    public final boolean isDefaultOpen() {
        return getConfig().defaultOpen;
    }

    public final String strategyName() {
        return getConfig().strategyName;
    }
}
