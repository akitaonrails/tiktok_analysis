package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_coin_cash_recharge_anim_time")
public final class LiveCoinCashRechargeAnimTimeSettings {
    public static final LiveCoinCashRechargeAnimTimeSettings INSTANCE = new LiveCoinCashRechargeAnimTimeSettings();
    public static final CoinCashRechargeAnimTimeParams DEFAULT = new CoinCashRechargeAnimTimeParams(172800, 86400);

    public final long getExitTimeMills() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        CoinCashRechargeAnimTimeParams coinCashRechargeAnimTimeParams = DEFAULT;
        CoinCashRechargeAnimTimeParams coinCashRechargeAnimTimeParams2 = (CoinCashRechargeAnimTimeParams) settingsManager.getValueSafely("live_coin_cash_recharge_anim_time", coinCashRechargeAnimTimeParams);
        return (coinCashRechargeAnimTimeParams2 != null ? coinCashRechargeAnimTimeParams2.exitDuration : coinCashRechargeAnimTimeParams.exitDuration) * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
    }

    public final long getResetTimeMills() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        CoinCashRechargeAnimTimeParams coinCashRechargeAnimTimeParams = DEFAULT;
        CoinCashRechargeAnimTimeParams coinCashRechargeAnimTimeParams2 = (CoinCashRechargeAnimTimeParams) settingsManager.getValueSafely("live_coin_cash_recharge_anim_time", coinCashRechargeAnimTimeParams);
        return (coinCashRechargeAnimTimeParams2 != null ? coinCashRechargeAnimTimeParams2.resetDuration : coinCashRechargeAnimTimeParams.resetDuration) * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
    }
}
