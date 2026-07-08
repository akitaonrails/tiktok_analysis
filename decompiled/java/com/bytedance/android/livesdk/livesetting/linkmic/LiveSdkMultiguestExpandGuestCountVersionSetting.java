package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_sdk_multiguest_expand_guest_count_version")
public final class LiveSdkMultiguestExpandGuestCountVersionSetting {
    public static final int DEFAULT = 2;
    public static final LiveSdkMultiguestExpandGuestCountVersionSetting INSTANCE = new LiveSdkMultiguestExpandGuestCountVersionSetting();
    public static final int ONE_V_N_EXP_HIGHT_HEIGHT = 1;
    public static final int ONE_V_N_NINE_MIC_COUNT = 4;
    public static final int ONE_V_N_OFF = 0;
    public static final int ONE_V_T_EXP_LOW_HEIGHT = 3;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_sdk_multiguest_expand_guest_count_version", DEFAULT);
    }
}
