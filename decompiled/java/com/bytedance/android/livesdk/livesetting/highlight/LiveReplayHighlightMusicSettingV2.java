package com.bytedance.android.livesdk.livesetting.highlight;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes5.dex */
@SettingsKey(preciseExperiment = false, value = "live_replay_highlight_bgmusic_v2")
public final class LiveReplayHighlightMusicSettingV2 {
    public static final int V1 = 1;
    public static final int V2 = 2;
    public static final int V3 = 3;
    public static final LiveReplayHighlightMusicSettingV2 INSTANCE = new LiveReplayHighlightMusicSettingV2();
    public static final int DEFAULT = 0;
    public static final int value = SettingsManager.INSTANCE.getIntValue("live_replay_highlight_bgmusic_v2", DEFAULT);

    public final boolean enable() {
        return value > 0;
    }

    public final boolean enableV1() {
        return value == 1;
    }

    public final boolean enableV2() {
        return value == 2;
    }

    public final boolean enableV3() {
        return value == 3;
    }

    public final int musicRecommendMode() {
        return value;
    }
}
