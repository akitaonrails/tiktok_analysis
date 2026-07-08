package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_ntp_server_url")
public final class LiveNtpServerUrlSetting {
    public static final String DEFAULT = "";
    public static final LiveNtpServerUrlSetting INSTANCE = new LiveNtpServerUrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_ntp_server_url", DEFAULT);
    }
}
