package com.bytedance.android.livesdk.replay;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_replay_video_size_change")
public final class LiveReplayVideoSizeChangeSetting {
    public static final LiveReplayVideoSizeChangeSetting INSTANCE = new LiveReplayVideoSizeChangeSetting();
    public static final boolean DEFAULT = false;
    public static boolean value = SettingsManager.INSTANCE.getBooleanValue("live_replay_video_size_change", DEFAULT);

    public final boolean getValue() {
        return value;
    }
}
