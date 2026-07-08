package com.bytedance.android.livesdk.livesetting.pullstream;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_net_adaptive_hurry_time")
public final class LiveNetAdaptiveHurryTimeSetting {
    public static final int DEFAULT = 2000;
    public static final LiveNetAdaptiveHurryTimeSetting INSTANCE = new LiveNetAdaptiveHurryTimeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_net_adaptive_hurry_time", DEFAULT);
    }
}
