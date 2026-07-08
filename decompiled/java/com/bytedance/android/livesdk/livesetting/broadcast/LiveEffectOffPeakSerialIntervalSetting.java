package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_effect_offpeak_serial_interval_ms")
public final class LiveEffectOffPeakSerialIntervalSetting {
    public static final LiveEffectOffPeakSerialIntervalSetting INSTANCE = new LiveEffectOffPeakSerialIntervalSetting();
    public static final long DEFAULT = 60000;

    public final long getSerialIntervalMs() {
        return SettingsManager.INSTANCE.getLongValue("live_effect_offpeak_serial_interval_ms", DEFAULT);
    }
}
