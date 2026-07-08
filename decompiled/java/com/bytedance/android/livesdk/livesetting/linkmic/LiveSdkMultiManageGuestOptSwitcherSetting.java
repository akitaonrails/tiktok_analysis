package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_multi_manage_guest_opt_switcher")
public final class LiveSdkMultiManageGuestOptSwitcherSetting {
    public static final boolean DEFAULT = true;
    public static final LiveSdkMultiManageGuestOptSwitcherSetting INSTANCE = new LiveSdkMultiManageGuestOptSwitcherSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_multi_manage_guest_opt_switcher", DEFAULT);
    }
}
