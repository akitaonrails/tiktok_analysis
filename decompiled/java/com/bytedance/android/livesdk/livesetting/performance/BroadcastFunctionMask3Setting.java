package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("broadcast_function_mask_public_screen_setting")
public final class BroadcastFunctionMask3Setting {
    public static final int DEFAULT = 0;
    public static final BroadcastFunctionMask3Setting INSTANCE = new BroadcastFunctionMask3Setting();

    public final int value() {
        return SettingsManager.INSTANCE.getIntValue("broadcast_function_mask_public_screen_setting", DEFAULT);
    }
}
