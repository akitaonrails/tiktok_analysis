package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_enable_rotate_in_link_progress")
public final class LiveSdkEnableRotateInLinkProgressSetting {
    public static final boolean DEFAULT = false;
    public static final LiveSdkEnableRotateInLinkProgressSetting INSTANCE = new LiveSdkEnableRotateInLinkProgressSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_enable_rotate_in_link_progress", DEFAULT);
    }
}
