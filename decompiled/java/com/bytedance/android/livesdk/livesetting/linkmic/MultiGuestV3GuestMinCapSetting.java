package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_multiguestv3_min_cap_fps_guest")
public final class MultiGuestV3GuestMinCapSetting {
    public static final boolean DEFAULT = false;
    public static final MultiGuestV3GuestMinCapSetting INSTANCE = new MultiGuestV3GuestMinCapSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_multiguestv3_min_cap_fps_guest", DEFAULT);
    }
}
