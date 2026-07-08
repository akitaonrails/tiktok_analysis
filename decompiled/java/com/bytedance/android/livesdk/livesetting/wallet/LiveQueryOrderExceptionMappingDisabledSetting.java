package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_query_order_exception_mapping_disabled")
public final class LiveQueryOrderExceptionMappingDisabledSetting {
    public static final boolean DEFAULT = true;
    public static final LiveQueryOrderExceptionMappingDisabledSetting INSTANCE = new LiveQueryOrderExceptionMappingDisabledSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_query_order_exception_mapping_disabled", DEFAULT);
    }
}
