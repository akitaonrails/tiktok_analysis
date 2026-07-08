package com.bytedance.android.livesdk.livesetting.pullstream;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_net_adaptive_slow_speed")
public final class LiveNetAdaptiveSlowSpeedSetting {
    public static final float DEFAULT = 1.0f;
    public static final LiveNetAdaptiveSlowSpeedSetting INSTANCE = new LiveNetAdaptiveSlowSpeedSetting();

    public final float getValue() {
        return SettingsManager.INSTANCE.getFloatValue("live_net_adaptive_slow_speed", DEFAULT);
    }
}
