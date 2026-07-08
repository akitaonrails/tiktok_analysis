package com.bytedance.android.livesdk.livesetting.decoration;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("donation_h5_url")
public final class DonationH5UrlSetting {
    public static final String DEFAULT = "";
    public static final DonationH5UrlSetting INSTANCE = new DonationH5UrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("donation_h5_url", DEFAULT);
    }
}
