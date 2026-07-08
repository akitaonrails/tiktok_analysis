package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("location_request_key")
public final class LocationKeySetting {
    public static final String DEFAULT = "5a337ec671a26fea653b1c1c8e3d06c3";
    public static final LocationKeySetting INSTANCE = new LocationKeySetting();

    public final String getValue() {
        String stringValue = SettingsManager.INSTANCE.getStringValue("location_request_key", DEFAULT);
        return stringValue.length() == 0 ? "5a337ec671a26fea653b1c1c8e3d06c3" : stringValue;
    }
}
