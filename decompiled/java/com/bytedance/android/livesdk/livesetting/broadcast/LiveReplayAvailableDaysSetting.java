package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_replay_available_days")
public final class LiveReplayAvailableDaysSetting {
    public static final int DEFAULT = 90;
    public static final LiveReplayAvailableDaysSetting INSTANCE = new LiveReplayAvailableDaysSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_replay_available_days", DEFAULT);
    }
}
