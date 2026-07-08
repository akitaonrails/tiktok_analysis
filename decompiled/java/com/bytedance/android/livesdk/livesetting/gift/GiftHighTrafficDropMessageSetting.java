package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "gift_high_traffic_buffer_dropping_strategy_android")
public final class GiftHighTrafficDropMessageSetting {
    public static final GiftHighTrafficDropMessageConfig DEFAULT;
    public static final GiftHighTrafficDropMessageSetting INSTANCE;
    public static final boolean enabled;

    static {
        GiftHighTrafficDropMessageSetting giftHighTrafficDropMessageSetting = new GiftHighTrafficDropMessageSetting();
        INSTANCE = giftHighTrafficDropMessageSetting;
        DEFAULT = new GiftHighTrafficDropMessageConfig(5000, 50, 500L, 1, 5);
        enabled = giftHighTrafficDropMessageSetting.getConfig().maxQueueLength > 0;
    }

    public final GiftHighTrafficDropMessageConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        GiftHighTrafficDropMessageConfig giftHighTrafficDropMessageConfig = DEFAULT;
        GiftHighTrafficDropMessageConfig giftHighTrafficDropMessageConfig2 = (GiftHighTrafficDropMessageConfig) settingsManager.getValueSafely("gift_high_traffic_buffer_dropping_strategy_android", giftHighTrafficDropMessageConfig);
        return giftHighTrafficDropMessageConfig2 != null ? giftHighTrafficDropMessageConfig2 : giftHighTrafficDropMessageConfig;
    }

    public final GiftHighTrafficDropMessageConfig getDEFAULT() {
        return DEFAULT;
    }

    public final boolean getEnabled() {
        return enabled;
    }
}
