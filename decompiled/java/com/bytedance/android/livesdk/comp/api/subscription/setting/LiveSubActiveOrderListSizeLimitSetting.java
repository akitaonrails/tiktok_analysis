package com.bytedance.android.livesdk.comp.api.subscription.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_sub_active_order_list_size_limit")
public final class LiveSubActiveOrderListSizeLimitSetting {
    public static final int DEFAULT = 1000;
    public static final LiveSubActiveOrderListSizeLimitSetting INSTANCE = new LiveSubActiveOrderListSizeLimitSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_sub_active_order_list_size_limit", DEFAULT);
    }
}
