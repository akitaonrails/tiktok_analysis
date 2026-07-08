package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_subscription_check_order_retry_interval")
public final class SubscribeCheckOrderRetryIntervalSetting {
    public static final SubscribeCheckOrderRetryIntervalSetting INSTANCE = new SubscribeCheckOrderRetryIntervalSetting();
    public static final String[] DEFAULT = {"2000", "2000", "2000"};

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("live_subscription_check_order_retry_interval", DEFAULT);
    }
}
