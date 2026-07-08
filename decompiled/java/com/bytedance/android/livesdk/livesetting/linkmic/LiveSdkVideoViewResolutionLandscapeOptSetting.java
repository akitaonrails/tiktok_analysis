package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_video_view_resolution_landscape_opt")
public final class LiveSdkVideoViewResolutionLandscapeOptSetting {
    public static final boolean DEFAULT = true;
    public static final LiveSdkVideoViewResolutionLandscapeOptSetting INSTANCE = new LiveSdkVideoViewResolutionLandscapeOptSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_video_view_resolution_landscape_opt", DEFAULT);
    }
}
