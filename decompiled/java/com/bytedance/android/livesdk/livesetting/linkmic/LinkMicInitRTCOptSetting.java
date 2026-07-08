package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_init_rtc_opt")
public final class LinkMicInitRTCOptSetting {
    public static final boolean DEFAULT = false;
    public static final LinkMicInitRTCOptSetting INSTANCE = new LinkMicInitRTCOptSetting();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_init_rtc_opt", DEFAULT);
    }
}
