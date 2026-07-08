package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes28.dex */
@SettingsKey("team_rank_bonus_time_sticker")
public final class TeamRankStickerSetting {
    public static final boolean DEFAULT = false;
    public static final TeamRankStickerSetting INSTANCE = new TeamRankStickerSetting();
    public static boolean useNewStyle;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("team_rank_bonus_time_sticker", DEFAULT);
    }

    public final boolean getUseNewStyle() {
        return useNewStyle;
    }

    public final void setUseNewStyle(boolean z) {
        useNewStyle = z;
    }
}
