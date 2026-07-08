package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("game_float_tips_edge_2_edge")
public final class GameFloatTipsEdge2Edge {
    public static final int DEFAULT = 1;
    public static final int DISABLE = 0;
    public static final GameFloatTipsEdge2Edge INSTANCE = new GameFloatTipsEdge2Edge();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("game_float_tips_edge_2_edge", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}
