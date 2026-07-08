package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_pull_sdk_get_data_interval")
public final class LivePullSdkGetDataIntervalSettings {
    public static final long DEFAULT = 5000;
    public static final LivePullSdkGetDataIntervalSettings INSTANCE = new LivePullSdkGetDataIntervalSettings();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_pull_sdk_get_data_interval", DEFAULT);
    }
}
