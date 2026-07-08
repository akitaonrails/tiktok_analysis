package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gpppa_recharge_ban_help_center")
public final class LiveWalletGPPPAHelpCenterSetting {
    public static final String DEFAULT = "https://support.tiktok.com/en/using-tiktok/growing-your-audience/government-politician-and-political-party-accounts";
    public static final LiveWalletGPPPAHelpCenterSetting INSTANCE = new LiveWalletGPPPAHelpCenterSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_gpppa_recharge_ban_help_center", DEFAULT);
    }
}
