package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_multi_guest_anchor_side_exp_config_read_opt")
public final class LiveSdkMultiGuestAnchorSideExpConfigReadOptSetting {
    public static final boolean DEFAULT = true;
    public static final LiveSdkMultiGuestAnchorSideExpConfigReadOptSetting INSTANCE = new LiveSdkMultiGuestAnchorSideExpConfigReadOptSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_multi_guest_anchor_side_exp_config_read_opt", DEFAULT);
    }
}
