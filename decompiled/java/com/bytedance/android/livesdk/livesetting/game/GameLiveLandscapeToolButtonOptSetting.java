package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = true, value = "game_live_landscape_hide_tool_button_opt")
public final class GameLiveLandscapeToolButtonOptSetting {
    public static final int DEFAULT = 0;
    public static final GameLiveLandscapeToolButtonOptSetting INSTANCE = new GameLiveLandscapeToolButtonOptSetting();
    public static final int KEEP_SHOW_COMMENT_BUTTON = 2;
    public static final int KEEP_SHOW_GIFT_AND_COMMENT_BUTTON = 1;
    public static final int NONE_KEEP_SHOW_BUTTON = 3;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("game_live_landscape_hide_tool_button_opt", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() > 0;
    }
}
