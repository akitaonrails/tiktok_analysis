package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("low_age_anchor_limit")
public final class LowAgeAnchorLimitSetting {
    public static final String DEFAULT = "18";
    public static final LowAgeAnchorLimitSetting INSTANCE = new LowAgeAnchorLimitSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("low_age_anchor_limit", DEFAULT);
    }
}
