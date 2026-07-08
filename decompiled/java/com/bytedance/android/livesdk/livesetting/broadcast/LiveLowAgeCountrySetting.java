package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_low_age_country")
public final class LiveLowAgeCountrySetting {
    public static final boolean DEFAULT = false;
    public static final LiveLowAgeCountrySetting INSTANCE = new LiveLowAgeCountrySetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_low_age_country", DEFAULT);
    }
}
