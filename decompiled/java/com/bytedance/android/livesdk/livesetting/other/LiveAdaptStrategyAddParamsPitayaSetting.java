package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_adapt_strategy_pitaya_params")
public final class LiveAdaptStrategyAddParamsPitayaSetting {
    public static final boolean DEFAULT = false;
    public static final LiveAdaptStrategyAddParamsPitayaSetting INSTANCE = new LiveAdaptStrategyAddParamsPitayaSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_adapt_strategy_pitaya_params", DEFAULT);
    }
}
