package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("gift_high_traffic_buffer_dropping_strategy_anchor_android")
public final class GiftHighTrafficDropMessageAnchorSetting {
    public static final GiftHighTrafficDropMessageConfig DEFAULT;
    public static final GiftHighTrafficDropMessageAnchorSetting INSTANCE = new GiftHighTrafficDropMessageAnchorSetting();
    public static final GiftHighTrafficDropMessageConfig config;
    public static final boolean enabled;

    static {
        GiftHighTrafficDropMessageConfig giftHighTrafficDropMessageConfig = new GiftHighTrafficDropMessageConfig(5000, 50, 500L, 1, 5);
        DEFAULT = giftHighTrafficDropMessageConfig;
        GiftHighTrafficDropMessageConfig giftHighTrafficDropMessageConfig2 = (GiftHighTrafficDropMessageConfig) SettingsManager.INSTANCE.getValueSafely("gift_high_traffic_buffer_dropping_strategy_anchor_android", giftHighTrafficDropMessageConfig);
        if (giftHighTrafficDropMessageConfig2 != null) {
            giftHighTrafficDropMessageConfig = giftHighTrafficDropMessageConfig2;
        }
        config = giftHighTrafficDropMessageConfig;
        enabled = giftHighTrafficDropMessageConfig.maxQueueLength > 0 && GiftMsgBufferControlOptSetting.INSTANCE.isConfigByRole();
    }

    public final GiftHighTrafficDropMessageConfig getConfig() {
        return config;
    }

    public final GiftHighTrafficDropMessageConfig getDEFAULT() {
        return DEFAULT;
    }

    public final boolean getEnabled() {
        return enabled;
    }
}
