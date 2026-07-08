package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes28.dex */
@SettingsKey("live_replay_highlight_videobar")
public final class LiveReplayHighlightVideobarSetting {
    public static final int DEFAULT = 0;
    public static final LiveReplayHighlightVideobarSetting INSTANCE = new LiveReplayHighlightVideobarSetting();
    public static final int V1 = 1;

    private final int currentValue() {
        return SettingsManager.INSTANCE.getIntValue("live_replay_highlight_videobar", DEFAULT);
    }

    public final boolean enable() {
        return currentValue() > 0;
    }
}
