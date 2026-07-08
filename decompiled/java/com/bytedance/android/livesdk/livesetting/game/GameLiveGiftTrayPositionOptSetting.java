package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = true, value = "game_live_portrait_gift_tray_position_opt")
public final class GameLiveGiftTrayPositionOptSetting {
    public static final int DEFAULT = 0;
    public static final GameLiveGiftTrayPositionOptSetting INSTANCE = new GameLiveGiftTrayPositionOptSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("game_live_portrait_gift_tray_position_opt", DEFAULT);
    }

    public final float getMoveValue() {
        int value = getValue();
        if (value > 45) {
            value = 45;
        }
        return value;
    }
}
