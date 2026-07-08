package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("enable_specific_gift_entrance_optimize")
public final class EnableSpecificGiftEntranceOptimizeSetting {
    public static final boolean DEFAULT = false;
    public static final EnableSpecificGiftEntranceOptimizeSetting INSTANCE = new EnableSpecificGiftEntranceOptimizeSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("enable_specific_gift_entrance_optimize", DEFAULT);
    }
}
