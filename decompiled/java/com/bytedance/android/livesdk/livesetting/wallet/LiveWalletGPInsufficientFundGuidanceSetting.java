package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes28.dex */
@SettingsKey("live_gp_insufficient_fund_guidance")
public final class LiveWalletGPInsufficientFundGuidanceSetting {
    public static final int DEFAULT = 0;
    public static final LiveWalletGPInsufficientFundGuidanceSetting INSTANCE = new LiveWalletGPInsufficientFundGuidanceSetting();
    public static final int RECREATE = 2;
    public static final int REUSE = 1;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_gp_insufficient_fund_guidance", DEFAULT);
    }
}
