package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_effect_strategy_preload")
public final class LiveEffectStrategyPreloadSetting {
    public static final LiveEffectStrategyPreloadSetting INSTANCE = new LiveEffectStrategyPreloadSetting();
    public static final int DEFAULT = 0;
    public static final int value = SettingsManager.INSTANCE.getIntValue("live_effect_strategy_preload", DEFAULT);

    public final boolean noStrategy() {
        return value == 1;
    }

    public final boolean withStrategy() {
        return value == 2;
    }
}
