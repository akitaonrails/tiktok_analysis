package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_kyc_view_details_url_settings")
public final class LiveKYCViewDetailUrlSetting {
    public static final String DEFAULT = "aweme://webview/?url=https%3A%2F%2Fwww.tiktok.com%2Fweb-inapp%2Fincome-wallet%2Fkyc-info-input%3Fhide_nav_bar%3D1%26scene%3D2&hide_nav_bar=1&hide_status_bar=1";
    public static final LiveKYCViewDetailUrlSetting INSTANCE = new LiveKYCViewDetailUrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_kyc_view_details_url_settings", DEFAULT);
    }
}
