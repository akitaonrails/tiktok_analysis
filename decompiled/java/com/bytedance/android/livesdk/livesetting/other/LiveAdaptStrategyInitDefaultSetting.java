package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_adapt_strategy_init_default_value")
public final class LiveAdaptStrategyInitDefaultSetting {
    public static final LiveAdaptStrategyInitDefaultSetting INSTANCE = new LiveAdaptStrategyInitDefaultSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_adapt_strategy_init_default_value", DEFAULT);
    }
}
