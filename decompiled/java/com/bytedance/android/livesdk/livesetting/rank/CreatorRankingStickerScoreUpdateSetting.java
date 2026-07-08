package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("creator_ranking_sticker_score_update_setting")
public final class CreatorRankingStickerScoreUpdateSetting {
    public static final CreatorRankingStickerScoreUpdateSetting INSTANCE = new CreatorRankingStickerScoreUpdateSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("creator_ranking_sticker_score_update_setting", DEFAULT);
    }
}
