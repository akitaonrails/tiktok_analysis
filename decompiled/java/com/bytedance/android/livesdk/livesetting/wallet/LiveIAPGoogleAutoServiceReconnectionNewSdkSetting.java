package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_iap_google_auto_service_reconnection_new_sdk")
public final class LiveIAPGoogleAutoServiceReconnectionNewSdkSetting {
    public static final boolean DEFAULT = false;
    public static final LiveIAPGoogleAutoServiceReconnectionNewSdkSetting INSTANCE = new LiveIAPGoogleAutoServiceReconnectionNewSdkSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_iap_google_auto_service_reconnection_new_sdk", DEFAULT);
    }
}
