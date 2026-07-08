package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_update_rtc_ext_info_fix")
public final class LinkMicRTCExtInfoFixSetting {
    public static final boolean DEFAULT = false;
    public static final LinkMicRTCExtInfoFixSetting INSTANCE = new LinkMicRTCExtInfoFixSetting();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_update_rtc_ext_info_fix", DEFAULT);
    }
}
