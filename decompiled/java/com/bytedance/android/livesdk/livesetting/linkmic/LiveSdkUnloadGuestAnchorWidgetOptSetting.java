package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_unload_guest_anchor_widget_opt")
public final class LiveSdkUnloadGuestAnchorWidgetOptSetting {
    public static final boolean DEFAULT = false;
    public static final LiveSdkUnloadGuestAnchorWidgetOptSetting INSTANCE = new LiveSdkUnloadGuestAnchorWidgetOptSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_unload_guest_anchor_widget_opt", DEFAULT);
    }
}
