package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("wallet_cashier_preload_timeout")
public final class LiveWalletCashierPreloadTimeoutSetting {
    public static final LiveWalletCashierPreloadTimeoutSetting INSTANCE = new LiveWalletCashierPreloadTimeoutSetting();
    public static final int DEFAULT = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("wallet_cashier_preload_timeout", DEFAULT);
    }
}
