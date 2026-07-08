package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_message_override_pp_url_setting")
public final class LiveMessageOverridePPUrlSetting {
    public static final LiveMessageOverridePPUrlSetting INSTANCE = new LiveMessageOverridePPUrlSetting();
    public static final String DEFAULT = "";

    public final String getPPUrl() {
        return SettingsManager.INSTANCE.getStringValue("live_message_override_pp_url_setting", DEFAULT);
    }

    public final String getDEFAULT() {
        return DEFAULT;
    }
}
