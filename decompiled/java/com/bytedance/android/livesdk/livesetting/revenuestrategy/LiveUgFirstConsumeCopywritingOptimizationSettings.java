package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_ug_first_consume_copywriting_optimization")
public final class LiveUgFirstConsumeCopywritingOptimizationSettings {
    public static final boolean DEFAULT = false;
    public static final LiveUgFirstConsumeCopywritingOptimizationSettings INSTANCE = new LiveUgFirstConsumeCopywritingOptimizationSettings();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_ug_first_consume_copywriting_optimization", DEFAULT);
    }
}
