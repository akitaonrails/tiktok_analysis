package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_popularity_ranking_bottom_bar_layout_setting")
public final class LivePopularityRankingBottomBarLayoutSetting {
    public static final LivePopularityRankingBottomBarLayoutSetting INSTANCE = new LivePopularityRankingBottomBarLayoutSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_popularity_ranking_bottom_bar_layout_setting", DEFAULT);
    }
}
