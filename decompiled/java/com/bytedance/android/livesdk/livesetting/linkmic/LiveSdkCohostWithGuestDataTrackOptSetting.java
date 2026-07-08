package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_cohost_with_guest_data_track_opt")
public final class LiveSdkCohostWithGuestDataTrackOptSetting {
    public static final boolean DEFAULT = true;
    public static final LiveSdkCohostWithGuestDataTrackOptSetting INSTANCE = new LiveSdkCohostWithGuestDataTrackOptSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_cohost_with_guest_data_track_opt", DEFAULT);
    }
}
