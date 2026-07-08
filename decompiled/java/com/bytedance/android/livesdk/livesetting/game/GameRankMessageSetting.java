package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("game_rank_message_optimize")
public final class GameRankMessageSetting {
    public static final int DISABLE = 0;
    public static final GameRankMessageSetting INSTANCE = new GameRankMessageSetting();
    public static final int DEFAULT = 1;

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("game_rank_message_optimize", DEFAULT);
    }

    public final boolean isDefault() {
        return getValue() == DEFAULT;
    }
}
