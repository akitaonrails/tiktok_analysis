package com.bytedance.android.livesdk.livesetting.watchlive.player;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_pause_pre_pull_stream_exp")
public final class LivePausePrePullStreamExp {
    public static final int DEFAULT = 0;
    public static final LivePausePrePullStreamExp INSTANCE = new LivePausePrePullStreamExp();
    public static final int ENABLE = 1;

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getIntValue("live_pause_pre_pull_stream_exp", DEFAULT) == 1;
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }

    public final int getENABLE() {
        return ENABLE;
    }
}
