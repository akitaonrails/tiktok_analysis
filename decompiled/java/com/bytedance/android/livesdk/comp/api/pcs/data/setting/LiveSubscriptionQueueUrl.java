package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_subscription_queue_url")
public final class LiveSubscriptionQueueUrl {
    public static final LiveSubscriptionQueueUrl INSTANCE = new LiveSubscriptionQueueUrl();
    public static final LiveSubscriptionQueueUrlConfig DEFAULT = new LiveSubscriptionQueueUrlConfig("", "", "", "", "");

    public final LiveSubscriptionQueueUrlConfig getSettingValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveSubscriptionQueueUrlConfig liveSubscriptionQueueUrlConfig = DEFAULT;
        LiveSubscriptionQueueUrlConfig liveSubscriptionQueueUrlConfig2 = (LiveSubscriptionQueueUrlConfig) settingsManager.getValueSafely("live_subscription_queue_url", liveSubscriptionQueueUrlConfig);
        return liveSubscriptionQueueUrlConfig2 != null ? liveSubscriptionQueueUrlConfig2 : liveSubscriptionQueueUrlConfig;
    }

    public final LiveSubscriptionQueueUrlConfig getDEFAULT() {
        return DEFAULT;
    }
}
