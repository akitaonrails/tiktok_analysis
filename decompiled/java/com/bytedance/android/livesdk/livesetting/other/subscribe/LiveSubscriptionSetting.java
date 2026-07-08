package com.bytedance.android.livesdk.livesetting.other.subscribe;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("mt_live_subscription")
public final class LiveSubscriptionSetting {
    public static final LiveSubscriptionSetting INSTANCE = new LiveSubscriptionSetting();
    public static final SubscriptionConfig DEFAULT = new SubscriptionConfig(0, 0, 0);

    public final SubscriptionConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        SubscriptionConfig subscriptionConfig = DEFAULT;
        SubscriptionConfig subscriptionConfig2 = (SubscriptionConfig) settingsManager.getValueSafely("mt_live_subscription", subscriptionConfig);
        return subscriptionConfig2 != null ? subscriptionConfig2 : subscriptionConfig;
    }
}
