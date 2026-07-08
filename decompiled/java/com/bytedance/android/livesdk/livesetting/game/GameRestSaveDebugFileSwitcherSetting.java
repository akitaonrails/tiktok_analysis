package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "game_rest_save_debug_file_switcher")
public final class GameRestSaveDebugFileSwitcherSetting {
    public static final int DEFAULT = 0;
    public static final GameRestSaveDebugFileSwitcherSetting INSTANCE = new GameRestSaveDebugFileSwitcherSetting();
    public static final int SAVE_ALL = 100;
    public static final int SAVE_INPUT = 2;
    public static final int SAVE_PHOTO = 1;

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("game_rest_save_debug_file_switcher", DEFAULT);
    }

    public final boolean enableSaveAll() {
        return getValue() == 100;
    }

    public final boolean enableSaveInput() {
        return getValue() == 2 || getValue() == 100;
    }

    public final boolean enableSavePhoto() {
        return getValue() == 1 || getValue() == 100;
    }
}
