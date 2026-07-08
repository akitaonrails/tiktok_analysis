package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_strategy_params_opt_async_switch")
public final class LiveStrategyParamsOptAsyncSwitchSetting {
    public static final LiveStrategyParamsOptAsyncSwitchSetting INSTANCE = new LiveStrategyParamsOptAsyncSwitchSetting();
    public static final boolean DEFAULT = true;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_strategy_params_opt_async_switch", true);

    public static /* synthetic */ void getValue$annotations() {
    }

    public static final boolean getValue() {
        return value;
    }
}
