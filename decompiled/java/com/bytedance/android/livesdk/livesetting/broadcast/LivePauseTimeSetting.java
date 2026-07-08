package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_anchor_pause_times")
public final class LivePauseTimeSetting {
    public static final int DEFAULT = 3;
    public static final LivePauseTimeSetting INSTANCE = new LivePauseTimeSetting();

    public final int getPauseTimes() {
        return SettingsManager.INSTANCE.getIntValue("live_anchor_pause_times", DEFAULT);
    }
}
