package com.bytedance.android.livesdk.game.broadcast.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("high_ping_adjust_bitrate")
public final class MobileHighPingAdjustBitrateInfo {
    public static final MobileHighPingAdjustBitrateInfo INSTANCE = new MobileHighPingAdjustBitrateInfo();
    public static final MobileHighPingAdjustBitrateConfig DEFAULT = new MobileHighPingAdjustBitrateConfig(0, 1, 3, 100, 0.95f, 0.8f, 0.1f);
    public static final int $stable = 8;

    public final MobileHighPingAdjustBitrateConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        MobileHighPingAdjustBitrateConfig mobileHighPingAdjustBitrateConfig = DEFAULT;
        MobileHighPingAdjustBitrateConfig mobileHighPingAdjustBitrateConfig2 = (MobileHighPingAdjustBitrateConfig) settingsManager.getValueSafely("high_ping_adjust_bitrate", mobileHighPingAdjustBitrateConfig);
        return mobileHighPingAdjustBitrateConfig2 != null ? mobileHighPingAdjustBitrateConfig2 : mobileHighPingAdjustBitrateConfig;
    }

    public final boolean isEnableAdjustBitrateScope() {
        return getValue().getHigh_ping_adjust_bitrate_scope() == 1;
    }
}
