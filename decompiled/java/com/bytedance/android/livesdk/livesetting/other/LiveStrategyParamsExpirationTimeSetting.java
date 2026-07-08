package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_strategy_score_result_cache_config")
public final class LiveStrategyParamsExpirationTimeSetting {
    public static final LiveStrategyParamsExpirationTimeSetting INSTANCE = new LiveStrategyParamsExpirationTimeSetting();
    public static final long DEFAULT = 30000;
    public static final long value = SettingsManager.INSTANCE.getLongValue("live_strategy_score_result_cache_config", 30000);

    public static /* synthetic */ void getValue$annotations() {
    }

    public static final long getValue() {
        return value;
    }
}
