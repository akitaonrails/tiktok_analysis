package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("game_float_tips_optimize")
public final class GameFloatTipsOptimize {
    public static final int DEFAULT = 0;
    public static final int GROUP_EXPERIMENT = 1;
    public static final GameFloatTipsOptimize INSTANCE = new GameFloatTipsOptimize();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("game_float_tips_optimize", DEFAULT);
    }

    public final boolean isExperimentGroup() {
        return getValue() == 1;
    }
}
