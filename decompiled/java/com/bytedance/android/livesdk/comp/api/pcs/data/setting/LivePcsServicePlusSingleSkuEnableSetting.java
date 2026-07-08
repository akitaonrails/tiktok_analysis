package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes28.dex */
@SettingsKey(preciseExperiment = false, value = "live_pcs_service_plus_single_sku_enable")
public final class LivePcsServicePlusSingleSkuEnableSetting {
    public static final boolean DEFAULT = false;
    public static final LivePcsServicePlusSingleSkuEnableSetting INSTANCE = new LivePcsServicePlusSingleSkuEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_pcs_service_plus_single_sku_enable", DEFAULT);
    }
}
