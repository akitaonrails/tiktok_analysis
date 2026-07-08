package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "anchor_slow_function_opt_ab")
public final class AnchorSlowFunctionOptABSetting {
    public static final int DEFAULT = 0;
    public static final AnchorSlowFunctionOptABSetting INSTANCE = new AnchorSlowFunctionOptABSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("anchor_slow_function_opt_ab", DEFAULT) == 1;
    }
}
