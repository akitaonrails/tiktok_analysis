package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_multi_guest_host_tag_ui_opt")
public final class LiveSdkMultiGuestHostTagUiOptSetting {
    public static final int DEFAULT = 0;
    public static final LiveSdkMultiGuestHostTagUiOptSetting INSTANCE = new LiveSdkMultiGuestHostTagUiOptSetting();
    public static final int OPT = 1;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_sdk_multi_guest_host_tag_ui_opt", DEFAULT);
    }

    public final boolean isOpt() {
        return getValue() == 1;
    }
}
