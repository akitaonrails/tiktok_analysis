package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_adapt_strategy_add_params_anchor")
public final class LiveAnchorAdaptStrategyAddParamsSetting {
    public static final boolean DEFAULT = false;
    public static final LiveAnchorAdaptStrategyAddParamsSetting INSTANCE = new LiveAnchorAdaptStrategyAddParamsSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_adapt_strategy_add_params_anchor", DEFAULT);
    }
}
