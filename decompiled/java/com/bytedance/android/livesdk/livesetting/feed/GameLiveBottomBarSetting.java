package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("ttlive_game_bottom_bar_setting")
public final class GameLiveBottomBarSetting {
    public static final boolean DEFAULT = false;
    public static final GameLiveBottomBarSetting INSTANCE = new GameLiveBottomBarSetting();
    public static final boolean ENABLE = true;

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlive_game_bottom_bar_setting", DEFAULT) == ENABLE;
    }
}
