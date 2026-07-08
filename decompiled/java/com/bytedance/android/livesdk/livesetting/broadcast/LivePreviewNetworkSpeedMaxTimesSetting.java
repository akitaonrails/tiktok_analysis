package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_go_live_bandwidth_test_max_times")
public final class LivePreviewNetworkSpeedMaxTimesSetting {
    public static final int DEFAULT = 5;
    public static final LivePreviewNetworkSpeedMaxTimesSetting INSTANCE = new LivePreviewNetworkSpeedMaxTimesSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_go_live_bandwidth_test_max_times", DEFAULT);
    }
}
