package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("ttlive_game_sub_rank_show_icon_settings")
public final class GameSubRankShowIconSetting {
    public static final boolean DEFAULT = false;
    public static final GameSubRankShowIconSetting INSTANCE = new GameSubRankShowIconSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlive_game_sub_rank_show_icon_settings", DEFAULT);
    }
}
