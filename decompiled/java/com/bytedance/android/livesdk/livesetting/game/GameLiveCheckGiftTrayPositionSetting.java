package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "game_live_check_gift_tray_position_immediately")
public final class GameLiveCheckGiftTrayPositionSetting {
    public static final boolean DEFAULT = false;
    public static final GameLiveCheckGiftTrayPositionSetting INSTANCE = new GameLiveCheckGiftTrayPositionSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("game_live_check_gift_tray_position_immediately", DEFAULT);
    }
}
