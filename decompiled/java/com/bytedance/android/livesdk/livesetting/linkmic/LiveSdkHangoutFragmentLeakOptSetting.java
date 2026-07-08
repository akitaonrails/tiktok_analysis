package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_hangout_fragment_leak_opt")
public final class LiveSdkHangoutFragmentLeakOptSetting {
    public static final boolean DEFAULT = true;
    public static final LiveSdkHangoutFragmentLeakOptSetting INSTANCE = new LiveSdkHangoutFragmentLeakOptSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_hangout_fragment_leak_opt", DEFAULT);
    }
}
