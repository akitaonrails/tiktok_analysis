package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("location_service_url")
public final class LocationHostSetting {
    public static final String DEFAULT = "";
    public static final LocationHostSetting INSTANCE = new LocationHostSetting();

    public final String getValue() {
        String stringValue = SettingsManager.INSTANCE.getStringValue("location_service_url", DEFAULT);
        return stringValue.length() == 0 ? "" : stringValue;
    }
}
