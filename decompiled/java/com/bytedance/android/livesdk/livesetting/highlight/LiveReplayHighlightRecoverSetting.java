package com.bytedance.android.livesdk.livesetting.highlight;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_replay_highlight_recover")
public final class LiveReplayHighlightRecoverSetting {
    public static final LiveReplayHighlightRecoverSetting INSTANCE = new LiveReplayHighlightRecoverSetting();
    public static final boolean DEFAULT = false;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_replay_highlight_recover", DEFAULT);

    public final boolean enable() {
        return value;
    }
}
