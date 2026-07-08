package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("linkmic_rtc_ab_params_multi_host")
public final class LinkMicRtcAbParamsMultiHostSetting {
    public static final String DEFAULT = "";
    public static final LinkMicRtcAbParamsMultiHostSetting INSTANCE = new LinkMicRtcAbParamsMultiHostSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("linkmic_rtc_ab_params_multi_host", DEFAULT);
    }
}
