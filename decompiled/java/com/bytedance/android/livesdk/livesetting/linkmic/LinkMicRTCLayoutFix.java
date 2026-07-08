package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_fix_layout_and_rtc_start_sequence")
public final class LinkMicRTCLayoutFix {
    public static final boolean DEFAULT = true;
    public static final LinkMicRTCLayoutFix INSTANCE = new LinkMicRTCLayoutFix();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_fix_layout_and_rtc_start_sequence", DEFAULT);
    }
}
