package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_strategy_task_finish_cash_recharge_popup_enable_coin_app")
public final class LiveStrategyTaskFinishCashRechargePopupEnableCoinAppSetting {
    public static final boolean DEFAULT = false;
    public static final LiveStrategyTaskFinishCashRechargePopupEnableCoinAppSetting INSTANCE = new LiveStrategyTaskFinishCashRechargePopupEnableCoinAppSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_strategy_task_finish_cash_recharge_popup_enable_coin_app", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
