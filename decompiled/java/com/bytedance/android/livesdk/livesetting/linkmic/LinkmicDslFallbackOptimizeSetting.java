package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_dsl_fallback_optimize")
public final class LinkmicDslFallbackOptimizeSetting {
    public static final boolean DEFAULT = true;
    public static final LinkmicDslFallbackOptimizeSetting INSTANCE = new LinkmicDslFallbackOptimizeSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_dsl_fallback_optimize", DEFAULT);
    }
}
