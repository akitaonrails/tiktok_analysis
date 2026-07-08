package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_anchor_multi_guest_show_open_camera_on_link_end")
public final class LiveSdkAnchorMultiGuestShowOpenCameraOnLinkEndSetting {
    public static final boolean DEFAULT = true;
    public static final LiveSdkAnchorMultiGuestShowOpenCameraOnLinkEndSetting INSTANCE = new LiveSdkAnchorMultiGuestShowOpenCameraOnLinkEndSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_anchor_multi_guest_show_open_camera_on_link_end", DEFAULT);
    }
}
