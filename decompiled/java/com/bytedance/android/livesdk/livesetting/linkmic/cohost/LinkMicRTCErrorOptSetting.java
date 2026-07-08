package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("Linkmic_rtc_error_opt_setting")
public final class LinkMicRTCErrorOptSetting {
    public static final boolean DEFAULT = true;
    public static final LinkMicRTCErrorOptSetting INSTANCE = new LinkMicRTCErrorOptSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("Linkmic_rtc_error_opt_setting", DEFAULT);
    }
}
