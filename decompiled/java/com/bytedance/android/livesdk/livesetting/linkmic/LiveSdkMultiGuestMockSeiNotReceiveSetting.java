package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_multi_guest_mock_sei_not_receive")
public final class LiveSdkMultiGuestMockSeiNotReceiveSetting {
    public static final boolean DEFAULT = false;
    public static final LiveSdkMultiGuestMockSeiNotReceiveSetting INSTANCE = new LiveSdkMultiGuestMockSeiNotReceiveSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_multi_guest_mock_sei_not_receive", DEFAULT);
    }
}
