package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("broadcast_function_mask_revenue_setting")
public final class BroadcastFunctionMask1Setting {
    public static final int DEFAULT = 0;
    public static final BroadcastFunctionMask1Setting INSTANCE = new BroadcastFunctionMask1Setting();

    public final int value() {
        return SettingsManager.INSTANCE.getIntValue("broadcast_function_mask_revenue_setting", DEFAULT);
    }
}
