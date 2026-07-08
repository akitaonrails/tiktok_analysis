package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_obs_help_page")
public final class LiveObsHelpPageSetting {
    public static final String DEFAULT = "https://inapp.tiktokv.com/falcon/webcast_mt/page/obs_intro/index.html";
    public static final LiveObsHelpPageSetting INSTANCE = new LiveObsHelpPageSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_obs_help_page", DEFAULT);
    }
}
