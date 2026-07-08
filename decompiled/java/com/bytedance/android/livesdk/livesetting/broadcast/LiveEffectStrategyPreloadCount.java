package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_effect_strategy_preload_count")
public final class LiveEffectStrategyPreloadCount {
    public static final LiveEffectStrategyPreloadCount INSTANCE = new LiveEffectStrategyPreloadCount();
    public static final int DEFAULT = 20;
    public static final int value = SettingsManager.INSTANCE.getIntValue("live_effect_strategy_preload_count", DEFAULT);

    public final int getCount() {
        return value;
    }
}
