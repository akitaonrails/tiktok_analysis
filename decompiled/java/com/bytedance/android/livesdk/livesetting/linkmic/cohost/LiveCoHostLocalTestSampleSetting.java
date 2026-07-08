package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_local_test_sample_enable")
public final class LiveCoHostLocalTestSampleSetting {
    public static final LiveCoHostLocalTestSampleSetting INSTANCE = new LiveCoHostLocalTestSampleSetting();
    public static final int DEFAULT = 1;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_cohost_local_test_sample_enable", DEFAULT);
    }

    public final boolean isDisable() {
        return getValue() != 1;
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}
