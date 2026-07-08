package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_linkmic_dsl_load_optimize")
public final class LiveLinkmicDslLoadOptimizeSetting {
    public static final boolean DEFAULT = true;
    public static final LiveLinkmicDslLoadOptimizeSetting INSTANCE = new LiveLinkmicDslLoadOptimizeSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_linkmic_dsl_load_optimize", DEFAULT);
    }
}
