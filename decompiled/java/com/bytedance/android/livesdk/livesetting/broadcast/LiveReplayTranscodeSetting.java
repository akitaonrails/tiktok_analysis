package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes28.dex */
@SettingsKey("live_replay_transcode_on_demand")
public final class LiveReplayTranscodeSetting {
    public static final int DEFAULT = 0;
    public static final LiveReplayTranscodeSetting INSTANCE = new LiveReplayTranscodeSetting();

    public final boolean hasInApp() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        int i = DEFAULT;
        return settingsManager.getIntValue("live_replay_transcode_on_demand", i) == 1 || settingsManager.getIntValue("live_replay_transcode_on_demand", i) == 3;
    }

    public final boolean hasInBox() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        int i = DEFAULT;
        return settingsManager.getIntValue("live_replay_transcode_on_demand", i) == 1 || settingsManager.getIntValue("live_replay_transcode_on_demand", i) == 2;
    }

    public final boolean inReplayTranscode() {
        return SettingsManager.INSTANCE.getIntValue("live_replay_transcode_on_demand", DEFAULT) != 0;
    }
}
