package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("broadcast_function_mask_room_function_setting")
public final class BroadcastFunctionMask4Setting {
    public static final int DEFAULT = 0;
    public static final BroadcastFunctionMask4Setting INSTANCE = new BroadcastFunctionMask4Setting();

    public final int value() {
        return SettingsManager.INSTANCE.getIntValue("broadcast_function_mask_room_function_setting", DEFAULT);
    }
}
