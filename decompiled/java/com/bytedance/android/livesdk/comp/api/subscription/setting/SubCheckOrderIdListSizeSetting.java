package com.bytedance.android.livesdk.comp.api.subscription.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "sub_check_order_id_list_size")
public final class SubCheckOrderIdListSizeSetting {
    public static final int DEFAULT = 5;
    public static final SubCheckOrderIdListSizeSetting INSTANCE = new SubCheckOrderIdListSizeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("sub_check_order_id_list_size", DEFAULT);
    }
}
