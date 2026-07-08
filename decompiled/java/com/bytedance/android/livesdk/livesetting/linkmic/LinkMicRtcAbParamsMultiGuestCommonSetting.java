package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("linkmic_rtc_ab_params_multi_guest_common")
public final class LinkMicRtcAbParamsMultiGuestCommonSetting {
    public static final String DEFAULT = "";
    public static final LinkMicRtcAbParamsMultiGuestCommonSetting INSTANCE = new LinkMicRtcAbParamsMultiGuestCommonSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("linkmic_rtc_ab_params_multi_guest_common", DEFAULT);
    }
}
