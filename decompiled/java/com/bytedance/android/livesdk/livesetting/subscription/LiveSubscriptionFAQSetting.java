package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_subscription_faq_url")
public final class LiveSubscriptionFAQSetting {
    public static LiveSubscriptionFAQMap lynxMap;
    public static final LiveSubscriptionFAQSetting INSTANCE = new LiveSubscriptionFAQSetting();
    public static final String DEFAULT = "";

    public final LiveSubscriptionFAQMap getValue() {
        if (lynxMap == null) {
            lynxMap = new LiveSubscriptionFAQMap(SettingsManager.INSTANCE.getStringValue("live_subscription_faq_url", DEFAULT));
        }
        LiveSubscriptionFAQMap liveSubscriptionFAQMap = lynxMap;
        return liveSubscriptionFAQMap == null ? new LiveSubscriptionFAQMap("") : liveSubscriptionFAQMap;
    }

    public final String getDEFAULT() {
        return DEFAULT;
    }
}
