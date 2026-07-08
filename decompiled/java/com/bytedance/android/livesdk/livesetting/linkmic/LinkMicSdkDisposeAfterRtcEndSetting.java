package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("linkmic_sdk_dispose_after_rtc_end_setting")
public final class LinkMicSdkDisposeAfterRtcEndSetting {
    public static final boolean DEFAULT = true;
    public static final LinkMicSdkDisposeAfterRtcEndSetting INSTANCE = new LinkMicSdkDisposeAfterRtcEndSetting();

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_sdk_dispose_after_rtc_end_setting", DEFAULT);
    }
}
