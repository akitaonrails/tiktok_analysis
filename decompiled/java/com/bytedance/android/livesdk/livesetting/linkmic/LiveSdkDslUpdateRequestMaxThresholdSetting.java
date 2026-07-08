package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_dsl_update_request_max_threshold")
public final class LiveSdkDslUpdateRequestMaxThresholdSetting {
    public static final int DEFAULT = 100;
    public static final LiveSdkDslUpdateRequestMaxThresholdSetting INSTANCE = new LiveSdkDslUpdateRequestMaxThresholdSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_sdk_dsl_update_request_max_threshold", DEFAULT);
    }
}
