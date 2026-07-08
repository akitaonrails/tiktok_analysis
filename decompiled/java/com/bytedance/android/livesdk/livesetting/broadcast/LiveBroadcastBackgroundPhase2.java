package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_background_green_v2")
public final class LiveBroadcastBackgroundPhase2 {
    public static final int DEFAULT = 0;
    public static final LiveBroadcastBackgroundPhase2 INSTANCE = new LiveBroadcastBackgroundPhase2();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("live_background_green_v2", DEFAULT) == 1;
    }
}
