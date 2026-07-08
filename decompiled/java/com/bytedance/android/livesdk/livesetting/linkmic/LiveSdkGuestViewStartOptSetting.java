package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_guest_view_start_opt")
public final class LiveSdkGuestViewStartOptSetting {
    public static final boolean DEFAULT = true;
    public static final LiveSdkGuestViewStartOptSetting INSTANCE = new LiveSdkGuestViewStartOptSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_guest_view_start_opt", DEFAULT);
    }
}
