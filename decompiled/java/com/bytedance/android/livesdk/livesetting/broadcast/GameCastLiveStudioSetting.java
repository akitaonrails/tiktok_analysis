package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("ttlive_game_cast_live_studio_setting")
public final class GameCastLiveStudioSetting {
    public static final int DEFAULT = 1;
    public static final GameCastLiveStudioSetting INSTANCE = new GameCastLiveStudioSetting();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("ttlive_game_cast_live_studio_setting", DEFAULT);
    }

    public final boolean enable() {
        return getValue() == 1;
    }
}
