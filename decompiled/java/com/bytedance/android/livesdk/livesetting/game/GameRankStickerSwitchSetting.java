package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "game_rank_sticker_switch")
public final class GameRankStickerSwitchSetting {
    public static final boolean DEFAULT = false;
    public static final GameRankStickerSwitchSetting INSTANCE = new GameRankStickerSwitchSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("game_rank_sticker_switch", DEFAULT);
    }
}
