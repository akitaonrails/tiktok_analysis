package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_sdk_fix_stop_rtc_after_cancel")
public final class LinkMicSdkFixStopRtcAfterCancel {
    public static final boolean DEFAULT = false;
    public static final LinkMicSdkFixStopRtcAfterCancel INSTANCE = new LinkMicSdkFixStopRtcAfterCancel();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_sdk_fix_stop_rtc_after_cancel", DEFAULT);
    }
}
