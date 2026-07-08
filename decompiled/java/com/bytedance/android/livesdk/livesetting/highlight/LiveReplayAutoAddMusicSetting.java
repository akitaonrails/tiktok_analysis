package com.bytedance.android.livesdk.livesetting.highlight;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_replay_auto_music_enable")
public final class LiveReplayAutoAddMusicSetting {
    public static final boolean DEFAULT = false;
    public static final LiveReplayAutoAddMusicSetting INSTANCE = new LiveReplayAutoAddMusicSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_replay_auto_music_enable", DEFAULT);
    }
}
