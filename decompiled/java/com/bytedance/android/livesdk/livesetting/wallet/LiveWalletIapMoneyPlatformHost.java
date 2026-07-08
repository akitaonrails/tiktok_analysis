package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("wallet_iap_configuration")
public final class LiveWalletIapMoneyPlatformHost {
    public static final LiveWalletIapMoneyPlatformHost INSTANCE = new LiveWalletIapMoneyPlatformHost();
    public static final String DEFAULT = "";

    public final String getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        String str = DEFAULT;
        String stringValue = settingsManager.getStringValue("wallet_iap_configuration", str);
        return stringValue != null ? stringValue : str;
    }
}
