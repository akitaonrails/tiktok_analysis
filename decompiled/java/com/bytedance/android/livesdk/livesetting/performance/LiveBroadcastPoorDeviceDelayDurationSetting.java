package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_broadcast_poor_device_delay_duration")
public final class LiveBroadcastPoorDeviceDelayDurationSetting {
    public static final long DEFAULT = 10000;
    public static final LiveBroadcastPoorDeviceDelayDurationSetting INSTANCE = new LiveBroadcastPoorDeviceDelayDurationSetting();

    public final long value() {
        return SettingsManager.INSTANCE.getLongValue("live_broadcast_poor_device_delay_duration", DEFAULT);
    }
}
