package com.bytedance.android.livesdk.livesetting.banner;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_middle_business_config")
public final class LiveMiddleTouchBusinessConfigSetting {
    public static final String DEFAULT = "";
    public static final LiveMiddleTouchBusinessConfigSetting INSTANCE = new LiveMiddleTouchBusinessConfigSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_middle_business_config", DEFAULT);
    }
}
