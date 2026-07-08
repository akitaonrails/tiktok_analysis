package com.bytedance.android.livesdk.livesetting.performance;

import X.C1697810uHb;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_host_charge_settings")
public final class LiveHostChargeSettings {
    public static final LiveHostChargeConfig DEFAULT;
    public static final LiveHostChargeSettings INSTANCE = new LiveHostChargeSettings();
    public static final LiveHostChargeConfig config;

    static {
        LiveHostChargeConfig liveHostChargeConfig = new LiveHostChargeConfig(false, C1697810uHb.LJIIJJI(10, 20), 60, 60L, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        DEFAULT = liveHostChargeConfig;
        LiveHostChargeConfig liveHostChargeConfig2 = (LiveHostChargeConfig) SettingsManager.INSTANCE.getValueSafely("live_host_charge_settings", liveHostChargeConfig);
        if (liveHostChargeConfig2 != null) {
            liveHostChargeConfig = liveHostChargeConfig2;
        }
        config = liveHostChargeConfig;
    }

    public static final int blockChargeCheckTime() {
        return config.blockChargeCheckTime;
    }

    public static final long checkChargeIntervalTime() {
        return config.checkChargeIntervalTime;
    }

    public static final boolean enable() {
        return config.enable;
    }

    public static final int predictedLiveDuration() {
        return config.predictedLiveDuration;
    }

    public static final List<Integer> skipCheckBatteryList() {
        return config.skipCheckBattery;
    }
}
