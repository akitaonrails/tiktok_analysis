package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_mock_use_local_dsl")
public final class LiveSdkMockUseLocalDslSetting {
    public static final boolean DEFAULT = false;
    public static final LiveSdkMockUseLocalDslSetting INSTANCE = new LiveSdkMockUseLocalDslSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_mock_use_local_dsl", DEFAULT);
    }
}
