package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_replay_share")
public final class LiveReplayShareSetting {
    public static final boolean DEFAULT = false;
    public static final LiveReplayShareSetting INSTANCE = new LiveReplayShareSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_replay_share", DEFAULT);
    }
}
