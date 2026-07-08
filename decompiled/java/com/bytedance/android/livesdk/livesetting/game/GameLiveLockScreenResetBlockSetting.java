package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "game_live_lock_screen_reset_block")
public final class GameLiveLockScreenResetBlockSetting {
    public static final boolean DEFAULT = false;
    public static final GameLiveLockScreenResetBlockSetting INSTANCE = new GameLiveLockScreenResetBlockSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("game_live_lock_screen_reset_block", DEFAULT);
    }
}
