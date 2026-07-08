package com.bytedance.android.livesdk.comp.api.subscription.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_sub_enable_mock_auto_renewal_sku_query_failed")
public final class LiveSubEnableMockAutoRenewalSkuQueryFailedSetting {
    public static final boolean DEFAULT = false;
    public static final LiveSubEnableMockAutoRenewalSkuQueryFailedSetting INSTANCE = new LiveSubEnableMockAutoRenewalSkuQueryFailedSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sub_enable_mock_auto_renewal_sku_query_failed", DEFAULT);
    }
}
