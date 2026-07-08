package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_hangout_sample_delay")
public final class LiveSdkHangoutSampleDelaySetting {
    public static final long DEFAULT = 1000;
    public static final LiveSdkHangoutSampleDelaySetting INSTANCE = new LiveSdkHangoutSampleDelaySetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_sdk_hangout_sample_delay", DEFAULT);
    }
}
