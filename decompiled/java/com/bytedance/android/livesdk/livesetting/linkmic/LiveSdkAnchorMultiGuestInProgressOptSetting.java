package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_anchor_multi_guest_in_progress_opt")
public final class LiveSdkAnchorMultiGuestInProgressOptSetting {
    public static final boolean DEFAULT = true;
    public static final LiveSdkAnchorMultiGuestInProgressOptSetting INSTANCE = new LiveSdkAnchorMultiGuestInProgressOptSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_anchor_multi_guest_in_progress_opt", DEFAULT);
    }
}
