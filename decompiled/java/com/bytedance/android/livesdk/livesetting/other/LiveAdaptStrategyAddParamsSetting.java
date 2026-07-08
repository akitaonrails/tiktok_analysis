package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_adapt_strategy_add_params")
public final class LiveAdaptStrategyAddParamsSetting {
    public static final boolean DEFAULT = false;
    public static final LiveAdaptStrategyAddParamsSetting INSTANCE = new LiveAdaptStrategyAddParamsSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_adapt_strategy_add_params", DEFAULT);
    }
}
