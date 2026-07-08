package com.bytedance.android.livesdk.livesetting.redenvelope;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("profit_low_age_restricted")
public final class AgeRestrictedConfig {
    public static final boolean DEFAULT = false;
    public static final AgeRestrictedConfig INSTANCE = new AgeRestrictedConfig();

    public final boolean isLimit() {
        return SettingsManager.INSTANCE.getBooleanValue("profit_low_age_restricted", DEFAULT);
    }
}
