package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_fix_rtc_clean_flag")
public final class LinkMicFixRtcCleanFlag {
    public static final boolean DEFAULT = true;
    public static final LinkMicFixRtcCleanFlag INSTANCE = new LinkMicFixRtcCleanFlag();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_fix_rtc_clean_flag", DEFAULT);
    }
}
