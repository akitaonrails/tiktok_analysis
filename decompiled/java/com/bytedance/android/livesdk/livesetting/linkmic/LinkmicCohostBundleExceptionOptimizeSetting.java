package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "linkmic_cohost_bundle_exception_optimize")
public final class LinkmicCohostBundleExceptionOptimizeSetting {
    public static final int DEFAULT = 0;
    public static final LinkmicCohostBundleExceptionOptimizeSetting INSTANCE = new LinkmicCohostBundleExceptionOptimizeSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("linkmic_cohost_bundle_exception_optimize", DEFAULT) != 0;
    }
}
