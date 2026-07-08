package com.bytedance.android.livesdk.livesetting.other.subscribe_enhance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_subscription_audience_entrance_enhance")
public final class SubscriptionAudienceEntranceEnhanceSetting {
    public static final boolean DEFAULT = false;
    public static final SubscriptionAudienceEntranceEnhanceSetting INSTANCE = new SubscriptionAudienceEntranceEnhanceSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_subscription_audience_entrance_enhance", DEFAULT);
    }
}
