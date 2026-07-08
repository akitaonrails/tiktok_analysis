package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("broadcast_function_mask_av_setting")
public final class BroadcastFunctionMask6Setting {
    public static final int DEFAULT = 0;
    public static final BroadcastFunctionMask6Setting INSTANCE = new BroadcastFunctionMask6Setting();

    public final int value() {
        return SettingsManager.INSTANCE.getIntValue("broadcast_function_mask_av_setting", DEFAULT);
    }
}
