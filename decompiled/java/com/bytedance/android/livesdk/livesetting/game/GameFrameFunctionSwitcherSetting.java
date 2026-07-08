package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "game_frame_function_switcher")
public final class GameFrameFunctionSwitcherSetting {
    public static final boolean DEFAULT = false;
    public static final GameFrameFunctionSwitcherSetting INSTANCE = new GameFrameFunctionSwitcherSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("game_frame_function_switcher", DEFAULT);
    }
}
