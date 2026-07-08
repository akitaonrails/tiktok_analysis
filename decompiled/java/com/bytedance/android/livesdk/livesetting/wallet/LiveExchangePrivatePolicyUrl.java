package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("exchange_us_privacy_policy_link")
public final class LiveExchangePrivatePolicyUrl {
    public static final String DEFAULT = "https://www.tiktok.com/legal/privacy-policy-us?lang=en";
    public static final LiveExchangePrivatePolicyUrl INSTANCE = new LiveExchangePrivatePolicyUrl();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("exchange_us_privacy_policy_link", DEFAULT);
    }
}
