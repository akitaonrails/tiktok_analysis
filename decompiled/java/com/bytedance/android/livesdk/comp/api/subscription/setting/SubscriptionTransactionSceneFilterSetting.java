package com.bytedance.android.livesdk.comp.api.subscription.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "subscription_extra_log_pb_filter")
public final class SubscriptionTransactionSceneFilterSetting {
    public static final SubscriptionTransactionSceneFilterSetting INSTANCE = new SubscriptionTransactionSceneFilterSetting();
    public static final String[] DEFAULT = new String[0];

    public final String[] getFilterList() {
        return SettingsManager.INSTANCE.getStringArrayValue("subscription_extra_log_pb_filter", DEFAULT);
    }
}
