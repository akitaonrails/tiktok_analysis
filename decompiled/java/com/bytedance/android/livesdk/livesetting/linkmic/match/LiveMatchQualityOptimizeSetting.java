package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("match_quality_optimize_switch")
public final class LiveMatchQualityOptimizeSetting {
    public static final int DEFAULT = 0;
    public static final LiveMatchQualityOptimizeSetting INSTANCE = new LiveMatchQualityOptimizeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("match_quality_optimize_switch", DEFAULT);
    }

    public final boolean enableOptimize() {
        return getValue() == 1;
    }
}
