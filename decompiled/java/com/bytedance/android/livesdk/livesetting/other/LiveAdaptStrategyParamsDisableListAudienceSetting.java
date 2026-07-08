package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_adapt_strategy_params_disable_list_audience")
public final class LiveAdaptStrategyParamsDisableListAudienceSetting {
    public static final LiveAdaptStrategyParamsDisableListAudienceSetting INSTANCE = new LiveAdaptStrategyParamsDisableListAudienceSetting();
    public static final String[] DEFAULT = new String[0];

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("live_adapt_strategy_params_disable_list_audience", DEFAULT);
    }
}
