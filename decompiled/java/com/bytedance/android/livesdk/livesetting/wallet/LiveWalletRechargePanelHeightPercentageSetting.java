package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_wallet_recharge_pane_height_percentage")
public final class LiveWalletRechargePanelHeightPercentageSetting {
    public static final int DEFAULT = 70;
    public static final LiveWalletRechargePanelHeightPercentageSetting INSTANCE = new LiveWalletRechargePanelHeightPercentageSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_wallet_recharge_pane_height_percentage", DEFAULT);
    }
}
