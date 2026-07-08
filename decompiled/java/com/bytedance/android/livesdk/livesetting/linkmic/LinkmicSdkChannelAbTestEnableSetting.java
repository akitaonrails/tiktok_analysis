package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_sdk_channel_ab_test_enable")
public final class LinkmicSdkChannelAbTestEnableSetting {
    public static final boolean DEFAULT = false;
    public static final LinkmicSdkChannelAbTestEnableSetting INSTANCE = new LinkmicSdkChannelAbTestEnableSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_sdk_channel_ab_test_enable", DEFAULT);
    }
}
