package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("iap_merchant_id_live_event")
public final class LiveEventIAPMerchantID {
    public static final LiveEventIAPMerchantID INSTANCE = new LiveEventIAPMerchantID();
    public static final String DEFAULT = "80LRFZB70401";

    public final String getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        String str = DEFAULT;
        String stringValue = settingsManager.getStringValue("iap_merchant_id_live_event", str);
        return stringValue != null ? stringValue : str;
    }
}
