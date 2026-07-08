package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_pk_connect_timeout_interval")
public final class LivePkConnectTimeoutIntervalSetting {
    public static final int DEFAULT = 20;
    public static final LivePkConnectTimeoutIntervalSetting INSTANCE = new LivePkConnectTimeoutIntervalSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_pk_connect_timeout_interval", DEFAULT);
    }
}
