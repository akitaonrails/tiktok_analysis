package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes28.dex */
@SettingsKey(preciseExperiment = false, value = "live_wallet_email_incentive")
public final class LiveEmailIncentiveSetting {
    public static final LiveEmailIncentiveSetting INSTANCE = new LiveEmailIncentiveSetting();
    public static final LiveWalletEmailIncentiveParams DEFAULT = new LiveWalletEmailIncentiveParams(false, 900, 0, "", 10, 2, 10000, 86400);

    public final LiveWalletEmailIncentiveParams getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveWalletEmailIncentiveParams liveWalletEmailIncentiveParams = DEFAULT;
        LiveWalletEmailIncentiveParams liveWalletEmailIncentiveParams2 = (LiveWalletEmailIncentiveParams) settingsManager.getValueSafely("live_wallet_email_incentive", liveWalletEmailIncentiveParams);
        return liveWalletEmailIncentiveParams2 != null ? liveWalletEmailIncentiveParams2 : liveWalletEmailIncentiveParams;
    }
}
