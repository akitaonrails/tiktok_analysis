package com.bytedance.android.livesdk.livesetting.pullstream;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_net_adaptive_hurry_speed")
public final class LiveNetAdaptiveHurrySpeedSetting {
    public static final float DEFAULT = 1.0f;
    public static final LiveNetAdaptiveHurrySpeedSetting INSTANCE = new LiveNetAdaptiveHurrySpeedSetting();

    public final float getValue() {
        return SettingsManager.INSTANCE.getFloatValue("live_net_adaptive_hurry_speed", DEFAULT);
    }
}
