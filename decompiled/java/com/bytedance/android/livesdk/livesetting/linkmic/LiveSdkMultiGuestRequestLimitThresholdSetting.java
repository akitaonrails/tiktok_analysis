package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_multi_guest_request_limit_threshold")
public final class LiveSdkMultiGuestRequestLimitThresholdSetting {
    public static final int DEFAULT = 10;
    public static final LiveSdkMultiGuestRequestLimitThresholdSetting INSTANCE = new LiveSdkMultiGuestRequestLimitThresholdSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_sdk_multi_guest_request_limit_threshold", DEFAULT);
    }
}
