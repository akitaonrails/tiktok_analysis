package com.bytedance.android.livesdk.game.broadcast.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("mobile_high_ping_optimize_config")
public final class MobileHighPingOptimizeInfo {
    public static final MobileHighPingOptimizeInfo INSTANCE = new MobileHighPingOptimizeInfo();
    public static final MobileHighPingOptimizeConfig DEFAULT = new MobileHighPingOptimizeConfig(15, 5, 100, 0.95f);
    public static final int $stable = 8;

    public final MobileHighPingOptimizeConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        MobileHighPingOptimizeConfig mobileHighPingOptimizeConfig = DEFAULT;
        MobileHighPingOptimizeConfig mobileHighPingOptimizeConfig2 = (MobileHighPingOptimizeConfig) settingsManager.getValueSafely("mobile_high_ping_optimize_config", mobileHighPingOptimizeConfig);
        return mobileHighPingOptimizeConfig2 != null ? mobileHighPingOptimizeConfig2 : mobileHighPingOptimizeConfig;
    }
}
