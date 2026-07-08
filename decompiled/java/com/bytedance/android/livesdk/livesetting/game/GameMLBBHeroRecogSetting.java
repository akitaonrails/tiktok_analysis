package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "game_mlbb_hero_recog")
public final class GameMLBBHeroRecogSetting {
    public static final GameMLBBHeroRecogSetting INSTANCE = new GameMLBBHeroRecogSetting();
    public static final GameMLBBHeroRecog DEFAULT = new GameMLBBHeroRecog();

    public final GameMLBBHeroRecog getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        GameMLBBHeroRecog gameMLBBHeroRecog = DEFAULT;
        GameMLBBHeroRecog gameMLBBHeroRecog2 = (GameMLBBHeroRecog) settingsManager.getValueSafely("game_mlbb_hero_recog", gameMLBBHeroRecog);
        return gameMLBBHeroRecog2 != null ? gameMLBBHeroRecog2 : gameMLBBHeroRecog;
    }
}
