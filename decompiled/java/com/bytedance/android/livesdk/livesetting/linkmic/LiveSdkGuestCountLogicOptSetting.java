package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_guest_count_logic_opt")
public final class LiveSdkGuestCountLogicOptSetting {
    public static final boolean DEFAULT = true;
    public static final LiveSdkGuestCountLogicOptSetting INSTANCE = new LiveSdkGuestCountLogicOptSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_guest_count_logic_opt", DEFAULT);
    }
}
