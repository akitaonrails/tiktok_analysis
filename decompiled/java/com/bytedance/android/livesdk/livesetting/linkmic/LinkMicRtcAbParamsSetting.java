package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("linkmic_rtc_ab_params")
public final class LinkMicRtcAbParamsSetting {
    public static final String DEFAULT = "";
    public static final LinkMicRtcAbParamsSetting INSTANCE = new LinkMicRtcAbParamsSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("linkmic_rtc_ab_params", DEFAULT);
    }
}
