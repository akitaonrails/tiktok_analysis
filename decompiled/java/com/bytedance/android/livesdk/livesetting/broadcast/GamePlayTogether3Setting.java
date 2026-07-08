package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlive_game_play_together_3_settings")
public final class GamePlayTogether3Setting {
    public static final boolean DEFAULT = true;
    public static final boolean GROUP_EXPERIMENT = false;
    public static final GamePlayTogether3Setting INSTANCE = new GamePlayTogether3Setting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlive_game_play_together_3_settings", DEFAULT);
    }
}
