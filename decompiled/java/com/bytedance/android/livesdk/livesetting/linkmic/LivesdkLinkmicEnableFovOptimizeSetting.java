package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C931820aM8;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "livesdk_linkmic_enable_fov_optimize")
public final class LivesdkLinkmicEnableFovOptimizeSetting {
    public static final boolean DEFAULT = true;
    public static final LivesdkLinkmicEnableFovOptimizeSetting INSTANCE = new LivesdkLinkmicEnableFovOptimizeSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("livesdk_linkmic_enable_fov_optimize", DEFAULT);
    }

    public final boolean isEnable(boolean z) {
        Boolean boolLIZLLL;
        if (!getValue()) {
            return false;
        }
        if (z) {
            boolLIZLLL = Boolean.valueOf(LiveAbLabelSetting.INSTANCE.getBooleanValue("livesdk_optimize_fov_for_small_window"));
        } else {
            boolLIZLLL = C931820aM8.LIZLLL("livesdk_optimize_fov_for_small_window");
        }
        if (boolLIZLLL == null || !boolLIZLLL.booleanValue()) {
            return false;
        }
        return true;
    }
}
