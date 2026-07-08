package com.bytedance.android.livesdk.livesetting.pullstream;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_sdk_ntp_enable")
public final class LiveSdkNtpEnableSetting {
    public static final int DEFAULT = 0;
    public static final LiveSdkNtpEnableSetting INSTANCE = new LiveSdkNtpEnableSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_sdk_ntp_enable", DEFAULT);
    }
}
