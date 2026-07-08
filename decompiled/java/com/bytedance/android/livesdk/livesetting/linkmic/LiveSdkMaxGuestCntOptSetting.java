package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_max_guest_cnt_opt")
public final class LiveSdkMaxGuestCntOptSetting {
    public static final boolean DEFAULT = true;
    public static final LiveSdkMaxGuestCntOptSetting INSTANCE = new LiveSdkMaxGuestCntOptSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_max_guest_cnt_opt", DEFAULT);
    }
}
