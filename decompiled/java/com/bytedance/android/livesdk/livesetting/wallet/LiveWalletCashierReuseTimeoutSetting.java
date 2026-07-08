package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("wallet_cashier_reuse_timeout")
public final class LiveWalletCashierReuseTimeoutSetting {
    public static final LiveWalletCashierReuseTimeoutSetting INSTANCE = new LiveWalletCashierReuseTimeoutSetting();
    public static final int DEFAULT = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("wallet_cashier_reuse_timeout", DEFAULT);
    }
}
