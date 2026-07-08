package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_random_linkmic_connect_timeout_interval")
public final class LiveRandomLinkmicConnectTimeoutIntervalSetting {
    public static final int DEFAULT = 10;
    public static final LiveRandomLinkmicConnectTimeoutIntervalSetting INSTANCE = new LiveRandomLinkmicConnectTimeoutIntervalSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_random_linkmic_connect_timeout_interval", DEFAULT);
    }
}
