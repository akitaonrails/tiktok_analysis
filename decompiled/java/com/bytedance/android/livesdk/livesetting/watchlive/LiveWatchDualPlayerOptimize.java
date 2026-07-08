package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("ttlive_watch_dual_player_optimize")
public final class LiveWatchDualPlayerOptimize {
    public static final int DEFAULT = 0;
    public static final int GROUP_EXPERIMENT = 1;
    public static final LiveWatchDualPlayerOptimize INSTANCE = new LiveWatchDualPlayerOptimize();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("ttlive_watch_dual_player_optimize", DEFAULT);
    }

    public final boolean isDefault() {
        return getValue() == 0;
    }
}
