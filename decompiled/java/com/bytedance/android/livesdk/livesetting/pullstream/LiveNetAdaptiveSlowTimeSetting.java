package com.bytedance.android.livesdk.livesetting.pullstream;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_net_adaptive_slow_time")
public final class LiveNetAdaptiveSlowTimeSetting {
    public static final int DEFAULT = 0;
    public static final LiveNetAdaptiveSlowTimeSetting INSTANCE = new LiveNetAdaptiveSlowTimeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_net_adaptive_slow_time", DEFAULT);
    }
}
