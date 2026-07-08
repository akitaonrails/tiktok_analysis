package com.bytedance.android.livesdk.livesetting.highlight;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_replay_video_first_frame_opt_enable")
public final class LiveReplayVideoFirstFrameOptEnableSetting {
    public static final LiveReplayVideoFirstFrameOptEnableSetting INSTANCE = new LiveReplayVideoFirstFrameOptEnableSetting();
    public static final boolean DEFAULT = false;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_replay_video_first_frame_opt_enable", DEFAULT);

    public final boolean enable() {
        return value;
    }
}
