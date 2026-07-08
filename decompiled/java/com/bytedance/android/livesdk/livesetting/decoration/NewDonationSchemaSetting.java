package com.bytedance.android.livesdk.livesetting.decoration;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("new_donation_schema")
public final class NewDonationSchemaSetting {
    public static final String DEFAULT = "";
    public static final NewDonationSchemaSetting INSTANCE = new NewDonationSchemaSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("new_donation_schema", DEFAULT);
    }
}
