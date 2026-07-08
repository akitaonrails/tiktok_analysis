package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_multi_guest_sei_list_equal_opt")
public final class LiveSdkMultiGuestSeiListEqualOptSetting {
    public static final boolean DEFAULT = false;
    public static final LiveSdkMultiGuestSeiListEqualOptSetting INSTANCE = new LiveSdkMultiGuestSeiListEqualOptSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_multi_guest_sei_list_equal_opt", DEFAULT);
    }
}
