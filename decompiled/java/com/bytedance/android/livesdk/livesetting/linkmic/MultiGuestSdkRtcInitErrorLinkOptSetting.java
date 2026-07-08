package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "multi_guest_sdk_rtc_init_error_link_opt")
public final class MultiGuestSdkRtcInitErrorLinkOptSetting {
    public static final int DEFAULT = 0;
    public static final MultiGuestSdkRtcInitErrorLinkOptSetting INSTANCE;
    public static final int OPT = 1;
    public static final boolean isOpt;

    static {
        MultiGuestSdkRtcInitErrorLinkOptSetting multiGuestSdkRtcInitErrorLinkOptSetting = new MultiGuestSdkRtcInitErrorLinkOptSetting();
        INSTANCE = multiGuestSdkRtcInitErrorLinkOptSetting;
        isOpt = multiGuestSdkRtcInitErrorLinkOptSetting.getValue() == 1;
    }

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_sdk_rtc_init_error_link_opt", DEFAULT);
    }

    public final boolean isOpt() {
        return isOpt;
    }
}
