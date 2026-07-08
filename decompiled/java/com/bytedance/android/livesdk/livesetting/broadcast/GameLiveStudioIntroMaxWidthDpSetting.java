package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("game_live_studio_intro_max_width_dp")
public final class GameLiveStudioIntroMaxWidthDpSetting {
    public static final int DEFAULT = 400;
    public static final GameLiveStudioIntroMaxWidthDpSetting INSTANCE = new GameLiveStudioIntroMaxWidthDpSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("game_live_studio_intro_max_width_dp", DEFAULT);
    }
}
