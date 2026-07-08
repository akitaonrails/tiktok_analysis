package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("go_live_subscription_awareness_bubble_enable")
public final class SubscriptionBubbleSetting {
    public static final int DEFAULT = 0;
    public static final SubscriptionBubbleSetting INSTANCE = new SubscriptionBubbleSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("go_live_subscription_awareness_bubble_enable", DEFAULT);
    }
}
