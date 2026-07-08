package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("ttlive_game_multi_stream_watch_live")
public final class LiveGameMultiStreamWatch {
    public static final int DEFAULT = 0;
    public static final int GROUP_EXPERIMENT = 1;
    public static final LiveGameMultiStreamWatch INSTANCE = new LiveGameMultiStreamWatch();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("ttlive_game_multi_stream_watch_live", DEFAULT);
    }

    public final boolean isExperimentGroup() {
        return getValue() == 1;
    }
}
