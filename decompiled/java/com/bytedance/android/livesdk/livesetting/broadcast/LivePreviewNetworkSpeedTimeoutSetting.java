package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_go_live_bandwidth_test_timeout")
public final class LivePreviewNetworkSpeedTimeoutSetting {
    public static final long DEFAULT = 4300;
    public static final LivePreviewNetworkSpeedTimeoutSetting INSTANCE = new LivePreviewNetworkSpeedTimeoutSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_go_live_bandwidth_test_timeout", DEFAULT);
    }
}
